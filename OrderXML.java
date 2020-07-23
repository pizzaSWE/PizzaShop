import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.io.File;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class OrderXML
{

    // public static void main(String[] args) {
    //     initialize();
    //     readXML();
    //     System.out.println(customer.firstName);
    //     System.out.println(customer.email);
    //     System.out.println(customer.cc);
    //     System.out.println(customer.secCode);
    //     System.out.println(items.drinks.get(0).type);
    //     saveXML();
    //     return;
    // }

    public static void initialize()
    {
        customer = new Customer();
        items = new Items();
    }

    public static void saveXML()
    {
        Document dom;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.newDocument();
            Element root = dom.createElement("Order");

            Element e = dom.createElement("Customer");
            Element firstName = dom.createElement("FirstName");
            Element lastName = dom.createElement("LastName");
            Element phone = dom.createElement("Phone");
            Element address = dom.createElement("Address");
            Element zip = dom.createElement("Zip");
            Element email = dom.createElement("Email");
            firstName.appendChild(dom.createTextNode(customer.firstName));
            lastName.appendChild(dom.createTextNode(customer.lastName));
            phone.appendChild(dom.createTextNode(customer.phone));
            address.appendChild(dom.createTextNode(customer.address));
            zip.appendChild(dom.createTextNode(customer.zip));
            email.appendChild(dom.createTextNode(customer.email));
            e.appendChild(firstName);
            e.appendChild(lastName);
            e.appendChild(phone);
            e.appendChild(address);
            e.appendChild(zip);
            e.appendChild(email);

            if (customer.cc != "") {
                Element payment = dom.createElement("Payment");
                Element card = dom.createElement("Card");

                Element number = dom.createElement("Number");
                number.appendChild(dom.createTextNode(customer.cc));
                card.appendChild(number);

                Element security = dom.createElement("Security");
                security.appendChild(dom.createTextNode(customer.secCode));
                card.appendChild(security);

                payment.appendChild(card);
                e.appendChild(payment);
            }


            root.appendChild(e);

            //TODO items section
            Element e2 = dom.createElement("Items");
            for (Pizza p : items.pizzas) {
                Element pizza = dom.createElement("Pizza");

                Element size = dom.createElement("Size");
                size.appendChild(dom.createTextNode(p.size));
                pizza.appendChild(size);

                Element crust = dom.createElement("Crust");
                crust.appendChild(dom.createTextNode(p.crust));
                pizza.appendChild(crust);

                for (String topping : p.toppings) {
                    Element toppingElement = dom.createElement("Topping");
                    toppingElement.appendChild(dom.createTextNode(topping));
                    pizza.appendChild(toppingElement);
                }

                e2.appendChild(pizza);
            }

            for (Drink d : items.drinks) {
                Element drink = dom.createElement("Drink");

                Element size = dom.createElement("Size");
                size.appendChild(dom.createTextNode(d.size));
                drink.appendChild(size);

                Element type = dom.createElement("Type");
                type.appendChild(dom.createTextNode(d.type));
                drink.appendChild(type);

                e2.appendChild(drink);
            }

            root.appendChild(e2);


            dom.appendChild(root);
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            String xml = "order.xml";
            tr.transform(new DOMSource(dom), new StreamResult(new FileOutputStream(xml)));

        } catch(Exception e) {System.out.println(e.getMessage());}
    }

    public static void readXML()
    {
        try {

        String filename = "order.xml";
        File orderxml = new File(filename);
        if (!orderxml.exists()) {
            return; // use default config values
        }

        Document dom;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        dom = db.parse(filename);
        Element doc = dom.getDocumentElement();

        // if the order.xml exists, it will have these two elements
        Element customerElement = (Element) getChildElements(doc).get(0);
        Element itemsElement = (Element) getChildElements(doc).get(1);

        // get customer fields
        ArrayList<Element> customerfields = getChildElements(customerElement);
        for (int i = 0; i < customerfields.size(); ++i) {
            Element e = (Element) customerfields.get(i);
            String name = e.getTagName();
            String text = e.getChildNodes().item(0).getTextContent();
            if (name == "FirstName") {
                customer.firstName = text;
            } else if (name == "LastName") {
                customer.lastName = text;
            } else if (name == "Phone") {
                customer.phone = text;
            } else if (name == "Address") {
                customer.address = text;
            } else if (name == "Email") {
                customer.email = text;
            } else if (name == "Zip") {
                customer.zip = text;
            } else if (name == "Payment") {
                Element cardOrCash = (Element) (getChildElements(e)).get(0);
                if (cardOrCash.getTagName() == "Card") {
                    for (int o = 0; o < getChildElements(cardOrCash).size(); ++o) {
                        Element cardDetail = (Element) getChildElements(cardOrCash).get(o);
                        if (cardDetail.getTagName() == "Number") {
                            customer.cc = getTextNodeChildrenValues(cardDetail).get(0);
                        } else if (cardDetail.getTagName() == "Security") {
                            customer.secCode = getTextNodeChildrenValues(cardDetail).get(0);
                        }
                    }
                }
            }
        }

        ArrayList<Element> itemsFields = getChildElements(itemsElement);
        for (Element pizzaElement : itemsFields) {
            if (pizzaElement.getTagName() == "Pizza") {
                Pizza ePizza = new Pizza();
                ArrayList<Element> pizzaFields = getChildElements(pizzaElement);
                for (Element pizzaField : pizzaFields) {
                    if (pizzaField.getTagName() == "Size") {
                        ePizza.size = getTextNodeChildrenValues(pizzaField).get(0);
                    } else if (pizzaField.getTagName() == "Crust") {
                        ePizza.crust = getTextNodeChildrenValues(pizzaField).get(0);
                    } else if (pizzaField.getTagName() == "Topping") {
                        ePizza.toppings.add(getTextNodeChildrenValues(pizzaField).get(0));
                    }
                }

                items.pizzas.add(ePizza);
            } else if (pizzaElement.getTagName() == "Drink") {
                Drink eDrink = new Drink();
                ArrayList<Element> drinkFields = getChildElements(pizzaElement);
                for (Element drinkField : drinkFields) {
                    if (drinkField.getTagName() == "Size") {
                        eDrink.size = getTextNodeChildrenValues(drinkField).get(0);
                    } else if (drinkField.getTagName() == "Type") {
                        eDrink.type = getTextNodeChildrenValues(drinkField).get(0);
                    }
                }
                items.drinks.add(eDrink);
            }
        }

        } catch (Exception e) {System.out.println(e.getMessage());}
        return;
    }

    private static ArrayList<Element> getChildElements(Element e)
    {
        ArrayList<Element> elements = new ArrayList<Element>();

        NodeList childs = e.getChildNodes();
        for (int i = 0; i < childs.getLength(); ++i) {
            Node child = childs.item(i);
            if (child instanceof Element) {
                elements.add((Element) child);
            }
        }
        return elements;
    }

    private static ArrayList<String> getTextNodeChildrenValues(Element e)
    {
        ArrayList<String> strings = new ArrayList<String>();
        NodeList childs = e.getChildNodes();
        for (int i = 0; i < childs.getLength(); ++i) {
            if (childs.item(i).getNodeType() == Node.TEXT_NODE) {
                strings.add(childs.item(i).getNodeValue());
            }
        }
        return strings;
    }

    public static Customer customer;
    public static Items items;

}

class Items {
    public Items()
    {
        pizzas = new ArrayList<Pizza>();
        drinks = new ArrayList<Drink>();
    }

    public ArrayList<Pizza> pizzas;
    public ArrayList<Drink> drinks;
}

class Pizza {
    public String size = "";
    public String crust = "";
    public ArrayList<String> toppings;

    public Pizza ()
    {
        toppings = new ArrayList<String>();
    }
}

class Drink {
    public String size = "";
    public String type = "";
}

class Customer
{
    public String firstName = "";
    public String lastName = "";
    public String phone = "";
    public String address = "";
    public String email = "";
    public String zip = "";
    public String cc = "";
    public String secCode = "";
}

