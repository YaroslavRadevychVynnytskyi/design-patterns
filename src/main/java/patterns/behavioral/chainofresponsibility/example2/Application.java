package patterns.behavioral.chainofresponsibility.example2;

import patterns.behavioral.chainofresponsibility.example2.handler.*;
import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public class Application {
    public static void main(String[] args) {
        AbstractLeaveHandler teamLead = new TeamLeadLeaveHandler();
        AbstractLeaveHandler projectManager = new ProjectManagerLeaveHandler();
        AbstractLeaveHandler departmentHead = new DepartmentHeadLeaveHandler();
        AbstractLeaveHandler ceo = new CEOLeaveHandler();

        AbstractLeaveHandler leaveHandler = teamLead.link(teamLead, projectManager, departmentHead, ceo);

        System.out.println("--- Request 1: 3 days ---");
        leaveHandler.processRequest(new LeaveRequest("Yaroslav Radevych-Vynnytskyi", 3));

        System.out.println("\n--- Request 2: 5 days ---");
        leaveHandler.processRequest(new LeaveRequest("Peter Penn", 5));

        System.out.println("\n--- Request 3: 10 days ---");
        leaveHandler.processRequest(new LeaveRequest("Tony Tonylife", 10));

        System.out.println("\n--- Request 4: 15 ---");
        leaveHandler.processRequest(new LeaveRequest("Tyler Durden", 31));
    }
}
