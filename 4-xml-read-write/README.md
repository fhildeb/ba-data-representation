# Java DOM XML Reader and Writer

This project demonstrates how to read and write XML files using the XML DOM (Document Object Model) in Java with the Xerces parser from Apache.

> There are two different data sets provided within the template folder: item measurements and a library book set. By default it reads and writes the library example.

## XMLDomReader(Main)

The DemoXmlDomReader class initializes a DOM parser and reads an XML file into a DOM object. It takes two parameters: the XML file and a boolean switch for validation. The class also includes a recursive method to display the DOM tree structure.

### Terminal Output

```
Demo XML-DOM auslesen
DOM-parsing erfolgreich
Das Wurzelelement heisst: biblio
   AttributName [xmlns:xsi] Wert [http://www.w3.org/2001/XMLSchema-instance]
   AttributName [xsi:noNamespaceSchemaLocation] Wert [Biblio.xsd]
   1.1. ElementName [#text] Wert [
	]
  Inhalt: [
	]
   1.2. ElementName [buch] Wert [null]
      AttributName [buch_id] Wert [_00001]
      2.1. ElementName [#text] Wert [
		]

...

    Inhalt: [
	]
   1.3. ElementName [#text] Wert [

	]

...

    Inhalt: [
		]
      2.6. ElementName [autoren] Wert [null]
         3.1. ElementName [#text] Wert [Niedermeier, St.; Scholz, M.]
      Inhalt: [Niedermeier, St.; Scholz, M.]
      2.7. ElementName [#text] Wert [

      ]

...
```

## XMLDomWriter(Main)

The DemoXmlDomWriter class creates a DOM object and writes it to an XML file. It has methods to create a DOM object, set attributes, add elements, and append text nodes. The class also provides functionality for pretty-print formatting.

> By default writes into books.xml

### Terminal Output

```
Demo DOM erzeugen und in eine XML-Datei schreiben
fertig
```
