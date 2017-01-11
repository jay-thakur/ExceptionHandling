/**
 * this class demonstrates - How to create our own exception.
 */
public class UserDefinedException {
    public static void main(String[] args) {
        try{
            validate(13);
        }catch (Exception e){
            System.out.println("Exception Occured : "+e);
        }
    }

    private static void validate(int age) throws InvalidAgeException{
        if (age < 18)
            throw new InvalidAgeException("You are not eligible to Vote");
        else
            System.out.println("Welcome Voter");
    }
}

/*
User defined Exception class
 */
class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}
