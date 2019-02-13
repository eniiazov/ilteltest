package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.*;


public class MyT {

    @Test
    public void lists(){
        Set<String> apples = new HashSet<>();
        apples.add("alma");
        apples.add("balyk");
        apples.add("aab");
        System.out.println(apples);
        List<String> l = new ArrayList<>(apples);
        System.out.println(l);
        Iterator<String> apps = apples.iterator();
        while(apps.hasNext()){
           if(apps.next().equals("aab"))
               apps.remove();;
        }
        System.out.println(apples);

    }

    @Test
    public void df(){
        Map<String, String> cities = new TreeMap<>();
        cities.put("hi", "may");
        cities.put("city", "chicago");
        System.out.println(cities);
        System.out.println(cities.get("city"));

    }

    @Test
    public void test(){

        Response response = RestAssured.get("http://cybertekchicago.com/student/118");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        String name =jp.get("firstName");
        System.out.println(name);
    }

    @Test
    public void delete(){
        for (int i = 9836; i > 320; i--){
            String query = "http://cybertekchicago.com/student/delete/" + i;
            Response r = RestAssured.delete(query);
            System.out.println(r.statusCode());

        }
    }



    @Test
    public void listOfInstructors(){
        Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
        JsonPath jp = response.jsonPath();
        List<String> name = jp.get("subject");
        System.out.println(name.size());
        for(String s: name){
            System.out.println(s == null);

        }
//        System.out.println();
    }


}
