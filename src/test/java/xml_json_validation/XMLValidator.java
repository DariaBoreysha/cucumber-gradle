package xml_json_validation;


import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;

public class XMLValidator {

    static final String xmlFilePath = "src/test/resources/SOAP checks/note.xml";
    static final String xsdSchemaPath = "src/test/resources/SOAP checks/note.xsd";

    public static boolean validateXML(String xsdSchemaPath, String xmlFilePath) {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            System.out.println("Validate XML against XSD Schema");
            Schema schema = factory.newSchema(new File(xsdSchemaPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlFilePath)));
            System.out.println("Validation is successful");
        } catch (SAXException | IOException e) {
            System.out.println("Error when validate XML against XSD Schema");
            System.out.println("Message: " + e.getMessage());
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
    validateXML(xsdSchemaPath,xmlFilePath);

    }
}
