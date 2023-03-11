package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    
    public String whileLoop() {
//        String result = "";
//         create a `counter`
//         while `counter` is less than length of array
//             begin loop
//                 use `counter` to identify the `current Person` in the array
//                 get `string Representation` of `currentPerson`
//                 append `stringRepresentation` to `result` variable
//             end loop
        StringBuilder result = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            String detail = Arrays.toString(personArray);
            Person currentPerson = personArray[counter];
            if (detail.contains(currentPerson.toString())) {
                result.append(currentPerson.toString());
            }
            counter++;
        }
        return result.toString();
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
