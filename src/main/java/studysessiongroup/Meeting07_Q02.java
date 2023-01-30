package studysessiongroup;

import java.util.Map;

public class Meeting07_Q02 {


        //2.

        // Modify and return the given map as follows: if the key “a” has a value, set the key “b” to have that value, and set the key “a” to have the value “”. Basically “b” is a bully, taking the value and replacing it with the empty string.
        //mapBully({“a”: “candy”, “b”: “dirt”}) → {“a”: “”, “b”: “candy”}
        // mapBully({“a”: “candy”}) → {“a”: “”, “b”: “candy”}
        // mapBully({“a”: “candy”, “b”: “carrot”, “c”: “meh”}) → {“a”: “”, “b”: “candy”, “c”: “meh”}.

        public Map<String, String> mapBully(Map<String, String> map) {
            if (map.containsKey("a")) {
                map.put("b", map.get("a"));
                map.put("a", "");
            }
            return map;


            //What is the difference between final and finally keywords?
/*
    interview question
    "final" keyword is very important in java.
            1) final keyword can be used for variables.
    public final int age =12;
    if you make a variable final you can not change it value.
    final variables must be initialized.

            2) final keyword can be used for methods
    final method body can not be updated.

            3) final keyword can be used for classes
    final classes can not have child classes.

    Note: "abstract classes" have something to do for child classes, if there is no child class, having "to do list" is not sensible.
      "final classes" cannot have child classes, therefore Java does not allow to make an abstract class final.

    Note:  "final method" body will be under protection by Java, because it should not be updated.
    But abstract methods don't have body, Java will look for the body to protect when it could not find it will complain

    finally: Used with exceptions, a block of code that will be executed no matter if there is an exception or not
            */

        }
}
