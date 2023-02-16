public class Main {
    public static void main(String[] args) {
        String partyAffiliation = "w";//declaring variable for user input



        System.out.println("Enter your political party affiliation");//output to get users answer

        if (partyAffiliation == "D"){//if their party affiliation is D,output this code block
            System.out.println("You get a Democratic Donkey");//output of D input
        }
        else if (partyAffiliation == "R") {//else if their party affiliation is R, output this code block
            System.out.println("You get a Republican Elephant");//output of R input
        }
        else if (partyAffiliation == "I") {//else if their party affiliation is I, output this code block
            System.out.println("You get an Independent Person");//output of I input

        }
        else{// else if they do not select D,R,I output this code block
            System.out.println("You have chosen Other");//output of any other input
        }

    }
}