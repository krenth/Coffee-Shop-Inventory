This is the start of the README file that will describe where in the code to find changes made. This will include the prompt, file name, line number, and change made.

Change Mainscreen Title
Change title to "Kurt's Coffee Shop" in the
mainscreen.html file on lines 14 and 19.

Change Search Text
Change text from "Search parts" to "Coffee Ingredients"
as well as change text from "Products" to "Coffee Drinks"
on lines 21 and 53 in the mainscreen.html file.

Change Button Texts
Change text from "Add Inhouse Part" and "Add Outsourced Part"
and "Add Product" to "Add Inhouse Ingredient", "Add Outsourced Ingredient",
and "Add Coffee Drink" on lines 30, 31, and 67 respectively in the 
mainscreen.html file.

Populate About Page and Add Mainscreen Button
Populate the about page with text describing the company
as well as add a button that takes the user back to the
mainscreen. All done in about.html

Add Sample Inventory
Add sample inventory that includes 5 parts and
5 products that does not overwrite existing
data in the database. This was done in BootStrapData.java
and includes lines 63 - 131

Add "Buy Product" Functionality
Add the buy product button that decreases a product's
inventory by 1 as well as display a confirmation or
error page. This was done on line 86 on mainscreen.html,
on lines 58-69 on MainScreenController.java, as well as
Added the result messages by creating productError.html 
and productSuccess.html.

Add Maximum and Minimum Inventory Fields + Minor Improvments
Add code to add maximum and minimum inventory fields 
on lines 32 - 111 of Part.java as well as the getter
and setter methods. Modified the sample inventory
to include these fields on 39 - 51 of mainscreen.html.
Add field to input these values on inhouse and outsourced
part forms on lines 26 - 30 of InhousePartForm.html and
lines 27 - 30 of OutsourcedPartForm.html. Rename the file
persistent storage is saved to on line 6 of application.properties
Modify the code to enforce the inventory is between the maximum
and minimum value by updating lines 71 - 112 of BootStrapData.java.
Update the program to alter a part's inventory if it is associated 
with a product and the product's inventory is changed on lines 
113 - 200 of AddProductController.java.

Add Form Validation for Part Inventory Between Maximum and Minimum Values
Create two new files called ValidPartInventory.java and 
PartInventoryValidator.java in order to validate that
the inventory for any part when updated is between the
maximum and minimum inventory values. Update the html 
forms InhousePartForm.html on lines 23 - 28 as well as
OutSourcedPartForm.html on lines 24 - 29 to display
the errors.

Add 2 Unit Tests for Maximum and Minimum Inventory Fields
Add 2 unit tests for the maximum and minimum fields
to PartTest.java on lines 105 - 139. Also did not 
remove any validators as all validators were used
in the project.

Remove Unused Validators
Updated and cleaned the code to remove any unused
validators within the project.
