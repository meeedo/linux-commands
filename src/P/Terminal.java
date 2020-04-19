
package P;

import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.text.SimpleDateFormat;
        import java.util.Date;



public class Terminal{

    private String currentDirectory="C:\\Users\\Admin\\Desktop";

    private String getCurrentDirectory(String givenPath)
    {
        String path="";
        if(givenPath.length() > Character.MIN_VALUE) {
            path = givenPath;
        }
        else
            path = currentDirectory;
        return currentDirectory;
    }

    public void cp(String sourcePath, String destinationPath ) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourcePath);
            outputStream = new FileOutputStream(destinationPath);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
        finally {
            inputStream.close();
            outputStream.close();
        }



    }
    public void mv(String sourcePath, String destinationPath)
    {
        File oldfile = new File(sourcePath);

        // renaming the file and moving it to a new location
        if(oldfile.renameTo
                (new File(destinationPath)))
        {
            // if file copied successfully then delete the original file
            oldfile.delete();
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }


    }




    public void mkdir(String givenPath, String dirName)

    {
        currentDirectory = getCurrentDirectory(givenPath);

        File directory = new File(currentDirectory + "\\" +dirName);
        boolean successful = directory.mkdir();
        if(successful)
        {
            System.out.println("Directory created successfully.");
        }
        else
            System.out.println("Failed creating directory" );
    }
    //delete directory ---> msh httms7 gher ella lw elly gwaha etmsa7
    public void rm(String givenPath, String filename)
    {
        currentDirectory = getCurrentDirectory(givenPath);

        File file = new File(currentDirectory);
        if(file.delete())
            System.out.println("File deleted successfully.");
        else
            System.out.println("Failed removing file");

    }


    public void rmdir(String givenPath, String filename)
    {
        currentDirectory = getCurrentDirectory(givenPath);
        File directory = new File(currentDirectory + "\\" + filename);
        if(directory.delete())
        {
            System.out.println("successfully deleted directory.");
        }
        else
            System.out.println("Failed deleting directory");

    }


    public void pwd()
    {
        System.out.println("Current directory: " + currentDirectory);
    }
    // public void cat(String[] paths);

    public void ls(String givenPath)
    {
        currentDirectory = getCurrentDirectory(givenPath);

        File folder = new File(givenPath);
        File[] listOfFiles = folder.listFiles();
        for(int i =0; i<listOfFiles.length; i++)
        {
            if(listOfFiles[i].isFile())
            {
                System.out.println(listOfFiles[i].getName());
            }
            else if(listOfFiles[i].isDirectory())
            {
                System.out.println(listOfFiles[i].getName());
            }
        }
    }


    public void date()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }
    public  void clear()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println("\n");
        }
        // System.out.print("\033[H\033[2J");
    }





    //de lesa msh kamla
    public void args()
    {
        System.out.println("cp oldFile newFile");
        System.out.println("rm filepath filename");
        System.out.println("rmdir directorypath directoryname");
        System.out.println("mkdir directorypath directoryname ");
        System.out.println("ls: List all files in the directory");
        System.out.println("cd: change directory");
        System.out.println("cat: ");
        System.out.println("more: Scroll down ");
        System.out.println("|: c");
        System.out.println(">:");
        System.out.println(">>:");
        System.out.println("mv:source path destination path");
        System.out.println("mv:  ");
        System.out.println("args:list all command arguments");
        System.out.println("date:Current date/time ");
        System.out.println("help: ");
        System.out.println("exit:stop all");
        System.out.println("pwd:print working directory");
        System.out.println("clear:clear terminal or print \n");
    }

    public void help()
    {
        System.out.println("cp: copy file");
        System.out.println("rm: remove file");
        System.out.println("rmdir: remove directory");
        System.out.println("mkdir: create directory");
        System.out.println("ls: List all files in the directory");
        System.out.println("cd: change directory");
        System.out.println("cat: ");
        System.out.println("more: Scroll down ");
        System.out.println("|: c");
        System.out.println(">:");
        System.out.println(">>:");
        System.out.println("mv:");
        System.out.println("mv: move file ");
        System.out.println("args:list all command arguments");
        System.out.println("date:Current date/time ");
        System.out.println("help:");
        System.out.println("exit:stop all");
        System.out.println("pwd:print working directory");
        System.out.println("clear:clear terminal");




    }

    public void cd(String directoryPath)
    {
        currentDirectory = directoryPath;
    }

    public void cat(String givenPath, String filename){

        currentDirectory = getCurrentDirectory(givenPath);
        File directory = new File(currentDirectory + "\\" +dirName);
        BufferedReader br = new BufferedReader(new FileReader(directory));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
// Add any other required command in the same structure…..
}