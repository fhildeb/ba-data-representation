# JSON Management and Validation

JSON Management and Validation refers to the process of handling and ensuring the correctness of data represented in JSON, the JavaScript Object Notation format. JSON management involves reading, writing, and manipulating data in JSON files, often using programming languages or specialized tools. JSON validation ensures that the data conforms to a specific structure, typically defined by a schema, which acts as a blueprint for the data. By validating JSON data, developers can catch inconsistencies, errors, or missing elements, ensuring data quality and interoperability between different systems or applications.

## Main(Main)

This program is used to demonstrate JSON Management and Validation. It reads, validates, and displays invoice data stored in JSON format. It consists of a tester class, which reads JSON data into a invoice list and displays its content. Additionally, the tester class can create a new invoice, add it to the list, and write the updated list back to a JSON file.

The schema validator class validates the JSON data against a provided JSON schema to ensure that the data adheres to the expected structure. The main class demonstrates the usage of these functionalities by reading invoice data, validating it against a schema, and displaying the invoice list if the validation is successful.

### Terminal Output

```
**************Rechnung, ID: 001**************/nDatum: 2018-04-28
Kaufliste /n  ->1x LOGOTECH T335 Headset Schwarz, 39.99 euro

**************Rechnung, ID: 002**************/nDatum: 2018-05-12
Kaufliste /n  ->1x Fastlink Maus M290 Anthrazit, 11.5 euro
  ->1x Fastlink Tastatur T290 Grau, 19.99 euro

**************Rechnung, ID: 003**************/nDatum: 2018-03-25
Kaufliste /n  ->1x GL F2323 24'' LED Monitor, 105.5 euro
  ->3x HDMI Kabel 2 Meter, 2.99 euro

**************Rechnung, ID: 004**************/nDatum: 2018-08-31
Kaufliste /n  ->1x SUSA Mainboard M121, 0.0 null
  ->1x MDA Prozessor K7 3,0 Ghz, 0.0 null
  ->4x CoolAir Gehäuselüfter AZ001, 0.0 null

Daten im Schema gueltig!
**************Rechnung, ID: 001**************/nDatum: 2018-04-28
Kaufliste /n  ->1x LOGOTECHT335HeadsetSchwarz, 39.99 euro

**************Rechnung, ID: 002**************/nDatum: 2018-05-12
Kaufliste /n  ->1x FastlinkMausM290Anthrazit, 11.5 euro
  ->1x FastlinkTastaturT290Grau, 19.99 euro

**************Rechnung, ID: 003**************/nDatum: 2018-03-25
Kaufliste /n  ->1x GLF232324''LEDMonitor, 105.5 euro
  ->3x HDMIKabel2Meter, 2.99 euro
```
