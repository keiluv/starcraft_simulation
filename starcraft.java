interface build{
    
    public String getStruct();// 입력받은 건물값 출력 메서드
    public String getUnit();//입력받은 유닛값 출력 메서드
    void BuildStruct();//건물짓기 출력 메서드
    void GenerateUnit();//유닛뽑기 출력 메서드
}

//테란 클래스
class Terran implements build{
    //건물 생성 set 메서드
    String struct;
    String unit;

    public void setStruct(String struct){
        this.struct = struct;
    }
    //유닛 생성 set 메서드
    
    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getStruct(){
        return struct;
    }
    public String getUnit(){
        return unit;
    }

    public void BuildStruct(){
        System.out.println(getStruct()+"이 건설되었습니다.");
    }
    public void GenerateUnit(){
        System.out.println(getUnit()+"이 소집되었습니다.");
    }
}

//저그 클래스
class Zerg implements build{
    String struct;
    String unit;
    //건물 생성 set 메서드
    public void setStruct(String struct){
        this.struct = struct;
    }
    //유닛 생성 set 메서드
    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getStruct(){
        return struct;
    }
    public String getUnit(){
        return unit;
    }

    public void BuildStruct(){
        System.out.println(getStruct()+"이 건설되었습니다.");
    }
    public void GenerateUnit(){
        System.out.println(getUnit()+"이 부화되었습니다.");
    }
}

//프로토스 클래스
class Protoss implements build{
    String struct;
    String unit;
    
    //건물 생성 set 메서드
    public void setStruct(String struct){
        this.struct = struct;
    }
    //유닛 생성 set 메서드
    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getStruct(){
        return struct;
    }
    public String getUnit(){
        return unit;
    }

    public void BuildStruct(){
        System.out.println(getStruct()+"이 소환되었습니다.");
    }
    public void GenerateUnit(){
        System.out.println(getUnit()+"이 소환되었습니다.");
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("스타크래프트");

        //객체생성
        Terran terran = new Terran();
        Zerg zerg = new Zerg();
        Protoss protoss = new Protoss();

        //인스턴스화
        terran.setStruct("배럭");
        terran.setUnit("마린");
        //은닉화된 데이터 접근
        System.out.println("테란입니다.");
        terran.BuildStruct();
        terran.GenerateUnit();

        zerg.setStruct("스포닝풀");
        zerg.setUnit("저글링");

        System.out.println("저그입니다.");
        zerg.BuildStruct();
        zerg.GenerateUnit();

        protoss.setStruct("게이트웨이");
        protoss.setUnit("질럿");
        System.out.println("프로토스입니다.");
        protoss.BuildStruct();
        protoss.GenerateUnit();

    }
}