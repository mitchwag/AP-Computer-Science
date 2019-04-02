Create a Name class which holds a person’s first and last name (separated by one space) in ONE private String field. In the class, there is a method named swapFirstLast() which returns the person’s name in the following format (the ‘∆’represents a space):

Lastname,∆Firstname

Example of using it in a NameTest class:

`Name mine = new Name(“Eileen∆Dover”);`
`System.out.println(mine.swapFirstLast());       // it would output: Dover,∆Eileen`

`Name yours = new Name(“Chris∆Parker”);`
`System.out.println(yours.swapFirstLast());       // it would output: Parker,∆Chris`
