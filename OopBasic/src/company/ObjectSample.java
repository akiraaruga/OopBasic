package company;

public class ObjectSample {

    public static void main(String[] args) {
        var salesdepartment=new Department("営業部", "××",100000);
        Employee sales=new Sales("鈴木", salesdepartment, "課長", 100);
        
        
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        System.out.println("");
        
        var devDepartment=new Department("開発部","yy",0);
        var engineer=new Engineer("田中", devDepartment, "一般社員", 88,"Java");
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developsoftware();
        
        System.out.println("");
        
        Employee projectManager=new Engineer("佐藤",devDepartment, "PM",99, "Java");
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            ((Engineer)projectManager).developsoftware();
            
            
        }
        
        System.out.println("");
        
        var parttimewoker=new ParttimeWorker("太田", salesdepartment);
                
        ((workable)sales).work();
        ((workable)engineer).work();
        ((workable)projectManager).work();
        ((workable)parttimewoker).work();
        
    
        
    }
}
