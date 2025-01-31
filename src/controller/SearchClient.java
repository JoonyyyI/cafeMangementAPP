package controller;

import model.Clients;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchClient {
   static Scanner sc = new Scanner(System.in);

   public static void FindID() {
      System.out.println("찾으시는 회원의 아이디를 입력해주세요: ");
      String case2InputID = sc.nextLine();

      System.out.println("찾으시는 회원의 이름을 입력해주세요: ");
      String case2InputName = sc.nextLine();

      Clients case2Client = SearchClientsID(case2InputID);

      if (case2Client != null) { // 찾으려는 회원 정보가 있는경우.
         if (case2Client.getClientName.equals(case2InputName)) {
            System.out.println(case2Client.getClientName() + "님의 회원정보");
            System.out.println("아이디: [" + case2Client.getClientID() + "]");
            System.out.println("비밀번호: [" + case2Client.getClientPWD() + "]");
         }
      } else {
         System.out.println("일치하시는 회원이 존재하지 않습니다.");
      }
   }

   public static Clients SearchClientsID(String clientID) {
      // file reader를 통해 회원정보가 들어있는 배열 가져온다 가정 -> ArrayList<Clients>
      ArrayList<Clients> clientsInfo = new ArrayList<Clients>();
      Clients TempClient = null;

      for (Clients client : clientsInfo) {
         if (client.getClientID().equals(clientID)) {
            TempClient = client;
         }
      }
      return TempClient; // 해당 아이디를 가진 회원이 존재하지 않는 경우 null 값 반환
   }

}
