package P;

public class Parser {
    String cmd ;
    String[] cmds = {"cd", "ls", "cp", "cat", "more", "mkdir", "rmdir", "mv", "rm", "args", "date", "help", "pwd", "clear"};
    String [] args ;

    public Parser (String line){
        if(!line.isEmpty()){

            cmd = line.split(" ")[0] ;
            if(!parse(line))
            {
                System.out.println("Invalid input");
                return;}
            args = new String[line.split(" ").length] ;
            for (int i = 1; i < line.length() ; i++) {
                args[i-1] = line.split(" ")[i] ;
            }
        }

    }

    public boolean parse(String input) {
        for(int i =0; i<cmds.length; i++)
        {
            if(cmds[i].equals(cmd)) {
                return true;
            }

        }
        return false;
    }

    public String getCmd() {
        return null;
    }

    //   public String[] getArguments(){}
}
