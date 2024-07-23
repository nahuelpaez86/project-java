package parcial2.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.sql.DriverManager.println;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.Wini;
import parcial2.Models.User;


public class UsersDataManager {

    private String userFilePath;
    
    public UsersDataManager() {
        File dataBase = new File("dataBase.ini");
        Wini ini;
        try {
            ini = new Wini(new File(dataBase.getAbsolutePath()));
            userFilePath= ini.get("Archivos", "users");
        } catch (IOException ex) {
            Logger.getLogger(UsersDataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    public void save(User newUser) {
        File file = new File(userFilePath);
        try {
            File file = new File(userFilePath);
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // traemos todos los usuarios
            ArrayList<User> users = getAllUsers();
            User newUserWithId = new User("2",newUser.getUser(),newUser.getName(),newUser.getPassword());
             System.out.print("LO QUE teniamoas:");
             System.out.print(users.size());
            //le agregamos el nuevo usuario
             users.add(newUserWithId);
             
            // almacenamos en la BD,
            oos.writeObject(users);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/

    
  public void save(User newUser) {
        File file = new File(userFilePath);
        User newUserWithId = new User("2", newUser.getUser(), newUser.getName(), newUser.getPassword());
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(newUserWithId);
            System.out.println("Objeto guardado en el archivo.");
            out.close();
        } catch (IOException e) {
            System.err.println("Error al guardar el objeto: " + e.getMessage());
        }
    }

    public void read() {
        try {
            File archivo = new File(userFilePath);
            FileInputStream fin = new FileInputStream(archivo.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fin);
            //ArrayList<User> users = (ArrayList<User>) ois.readObject();
            User users = (User) ois.readObject();
            System.out.println("DATA: ");
            System.out.println(users.toString());
            
            fin.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // Método genérico para leer un objeto desde un archivo
    @SuppressWarnings("unchecked")
    /*
    
   public ArrayList<User> getAllUsers() {
        ArrayList<User> allUsers = new ArrayList<>();
       try {
             File file = new File(userFilePath);
            if (!file.exists()) {
                System.out.println("El archivo no existe: " + file.getAbsolutePath());
                return allUsers;
            }
            FileInputStream fin = new FileInputStream(file.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fin);
            allUsers = (ArrayList<User>) ois.readObject();
            ois.close();
            fin.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
       return allUsers;
    }*/
   
   public ArrayList<User> getAllUsers() {
        ArrayList<User> allUsers = new ArrayList<>();
        File file = new File(userFilePath);
       read();
        // Comprobar si el archivo existe
        if (!file.exists()) {
            System.out.println("El archivo no existe: " + userFilePath);
            return allUsers; // Retorna una lista vacía si el archivo no existe
        }

        try (FileInputStream fin = new FileInputStream(file.getAbsolutePath());
             ObjectInputStream ois = new ObjectInputStream(fin)) {

            // Leer objeto del archivo
            allUsers = (ArrayList<User>) ois.readObject();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de I/O: " + e.getMessage());
            e.printStackTrace();
        }

        return allUsers;
    }
}
