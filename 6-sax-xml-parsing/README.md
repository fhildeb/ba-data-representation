# Custom SAX XML Parsing

SAX (Simple API for XML) parsing is a popular, event-driven method for processing XML documents in a streaming manner. Unlike DOM (Document Object Model) parsing, which loads the entire XML document into memory as a tree structure, SAX parsing reads the XML file sequentially from start to end, generating events for each element, attribute, and piece of text encountered.

## SAXReader (Main)

This program parses an XML file, showcasing the implementation of custom content and error handlers.
It sets up and configures the XMLReader with the necessary features and properties for schema validation and demonstrates how to parse an XML file, providing an example of using SAX-based XML processing.

The content handler processes XML elements and their attributes, displaying relevant information such as element names, attributes, and line numbers. The error class handles warnings, errors, and fatal errors that may occur during the parsing process, providing diagnostic information for troubleshooting.

> Two different data sets are available within templates: address book and library list. By default, it reads and outputs library objects.

### Terminal Output

```
Demo XML-SAX-Reader
Dokument gestartet ab Zeile 1
Namespace-Beginn: xsiURI: http://www.w3.org/2001/XMLSchema-instance
Element <biblio> gestartet ab Zeile 4
Attribut-Name: xsi:noNamespaceSchemaLocation
TextContent: {
	}
Element <buch> gestartet ab Zeile 5
Attribut-Name: buch_id
TextContent: {
		}
Element <kuerzel> gestartet ab Zeile 6
TextContent: {[Harold 05}
TextContent: {]}
Element <kuerzel> beendet auf Zeile 6
TextContent: {
		}
Element <titel> gestartet ab Zeile 7
TextContent: {XML in an Nutshell}
Element <titel> beendet auf Zeile 7
TextContent: {
		}
Element <autoren> gestartet ab Zeile 8
TextContent: {Harold, E.R.; Means, W.S.}
Element <autoren> beendet auf Zeile 8
TextContent: {
		}
Element <verlag> gestartet ab Zeile 9
TextContent: {O}
TextContent: {'}
TextContent: {Reilly Verlag Köln}
Element <verlag> beendet auf Zeile 9
TextContent: {
	}
Element <buch> beendet auf Zeile 10
TextContent: {

	}
Element <buch> gestartet ab Zeile 12
Attribut-Name: buch_id
TextContent: {
		}
Element <kuerzel> gestartet ab Zeile 13
TextContent: {[Niedermeier 05}
TextContent: {]}
Element <kuerzel> beendet auf Zeile 13
TextContent: {
		}
Element <titel> gestartet ab Zeile 14
TextContent: {Java und XML}
Element <titel> beendet auf Zeile 14
TextContent: {
		}
Element <autoren> gestartet ab Zeile 15
TextContent: {Niedermeier, St.; Scholz, M.}
Element <autoren> beendet auf Zeile 15
TextContent: {


		}
Element <verlag> gestartet ab Zeile 18
TextContent: {Galileo Press Bonn}
Element <verlag> beendet auf Zeile 18
TextContent: {
	}
Element <buch> beendet auf Zeile 19
TextContent: {
}
Element <biblio> beendet auf Zeile 20
Namespace-Ende: xsi
Dokument beendet auf Zeile 21
SAX-Parsen erfolgreich
```
