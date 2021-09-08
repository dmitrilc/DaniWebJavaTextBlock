package com.example;

public class Entry {

    public static void main(String[] args){

    }

    private static String noBlock(){
        var html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>Hello World</p>\n" +
                "    </body>\n" +
                "</html>";

        return html;
    }

    private static String textBlock(){
        var html = """
                <!DOCTYPE html>
                <html>
                    <head>
                    </head>
                    <body>
                        <p>Hello World</p>
                    </body>
                </html>
                """;

        return html;
    }

    private static String withNewline(){
        return  """
                Hello
                World
                """;
    }

    private static String noNewline(){
        return """
                Hello
                World""";
    }

    private static String zeroSpaces(){
        return  """
                Hello
                World
                """;
    }

    private static String eightSpaces(){
        return  """
                Hello
                World
        """;
    }

    private static String sixteenSpaces(){
        return  """
                Hello
                World
""";
    }

    private static String fourSpaces(){
        return """
                Hello
                World""".indent(4);
    }

    private static String charSub() {
        return """
                Hello$$$$
                World
                """.replace('$', ' ');
    }

    private static String charFence() {
        return """
                Hello   |
                World|
                """.replace("|\n", "\n");
    }

    private static String octalEscape() {
        return """
                Hello\040\040\040
                World
                """;
    }

}