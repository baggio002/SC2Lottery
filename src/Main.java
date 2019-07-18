import java.util.*;

public class Main {
    Map<Integer, Lottery> pMap = new HashMap<Integer, Lottery>();
    Map<Integer, Lottery> zMap = new HashMap<Integer, Lottery>();
    Map<Integer, Lottery> tMap = new HashMap<Integer, Lottery>();
    Map<Integer, Lottery> rMap = new HashMap<Integer, Lottery>();
    {
        int id = 0;
        Lottery lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("闲庭信步");
        lottery.setDesc("禁止冲锋和使徒速攻科技");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("交通管制");
        lottery.setDesc("禁止使用棱镜和追猎闪烁科技");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("沉默");
        lottery.setDesc("禁止使用心灵风暴和立场");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("动物保护");
        lottery.setDesc("禁止使用巨像和自爆球");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("道路狭窄");
        lottery.setDesc("禁止使用白球");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("斩断卡拉");
        lottery.setDesc("禁止使用星灵枢纽的加速和召回技能");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("限制吨位");
        lottery.setDesc("禁止航母");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("节约能源");
        lottery.setDesc("禁止不朽者和电池");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("贤者时间");
        lottery.setDesc("50%血");
        pMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.PROTOSS);
        lottery.setName("裸奔");
        lottery.setDesc("禁止升级攻防");
        pMap.put(lottery.getId(), lottery);
    }
    {
        int id = 0;
        Lottery lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("进化失败");
        lottery.setDesc("禁止升级小狗和毒爆速度以及小狗攻速");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("花岗岩地表");
        lottery.setDesc("禁止埋地（包括潜伏者埋地）和坑道虫");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("杀虫剂");
        lottery.setDesc("禁止使用大龙和宿主");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("除四害");
        lottery.setDesc("禁止使用蟑螂/火蟑螂");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("保持清洁");
        lottery.setDesc("禁止铺菌毯，飞蛇雾和感染虫的诱捕");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("肌肉萎缩");
        lottery.setDesc("禁止注卵，禁止升级刺蛇射程和速度");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("象牙走私");
        lottery.setDesc("禁止使用大牛");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("禁飞区");
        lottery.setDesc("禁止使用王虫运输和飞龙");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("贤者时间");
        lottery.setDesc("50%血");
        zMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.ZERG);
        lottery.setName("裸奔");
        lottery.setDesc("禁止升级攻防");
        zMap.put(lottery.getId(), lottery);
    }
    {
        int id = 0;
        Lottery lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("补给短缺");
        lottery.setDesc("禁止兴奋剂科技和盾牌科技");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("动物保护");
        lottery.setDesc("禁止矿骡和火车/火车侠");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("禁飞区");
        lottery.setDesc("禁止运输机和女妖");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("生锈");
        lottery.setDesc("禁止快速变形科技和解放者架起");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("扫雷");
        lottery.setDesc("禁止地雷速埋科技");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("不扩散核武器");
        lottery.setDesc("禁止使用核弹");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("限制吨位");
        lottery.setDesc("禁止巡航舰");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("车辆保养");
        lottery.setDesc("禁止坦克架起和导弹车");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("贤者时间");
        lottery.setDesc("50%血");
        tMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.TERRAN);
        lottery.setName("裸奔");
        lottery.setDesc("禁止升级攻防");
        tMap.put(lottery.getId(), lottery);
    }
    {
        int id = 0;
        Lottery lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("贸易保护");
        lottery.setDesc("同时生存的农民数不能超过45（如果多出农民不采集资源即可）");
        rMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("计划生育");
        lottery.setDesc("最高人口数不能超过150（如果多出人口，只要不参战或者不工作即可）");
        rMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("谋而后定");
        lottery.setDesc("5分钟以前攻击单位不能离开自己矿区");
        rMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("资源匮乏");
        lottery.setDesc("整场游戏只能采集三片矿");
        rMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("贤者时间");
        lottery.setDesc("50%血");
        rMap.put(lottery.getId(), lottery);
        lottery = new Lottery();
        lottery.setId(id++);
        lottery.setRace(Race.RANDOM);
        lottery.setName("裸奔");
        lottery.setDesc("禁止升级攻防");
        rMap.put(lottery.getId(), lottery);
    }

    private void print(Race race) {
        for (Lottery lottery: getRaceLotteryMap(race).values()) {
            System.out.println("Race = " + lottery.getRace().name() + " id = " + lottery.getId() + " name = " + lottery.getName() + " desc = " + lottery.getDesc());
        }
    }

    private void printList(List<Lottery> list) {
        for (Lottery lottery: list) {
            System.out.println("Race = " + lottery.getRace().name() + " id = " + lottery.getId() + " name = " + lottery.getName() + " desc = " + lottery.getDesc());
        }
    }

    private Map<Integer, Lottery> getRaceLotteryMap(Race race) {
        Map<Integer, Lottery> list;
        switch (race) {
            case PROTOSS:
                list = pMap;
                break;
            case TERRAN:
                list = tMap;
                break;
            case ZERG:
                list = zMap;
                break;
            default:
                list = rMap;
                break;
        }
        return list;
    }

    private int randomId(int bond) {
        Random r = new Random();
        return r.nextInt(bond);
    }

    private List<Lottery> lottery(Race race) {
        Map<Integer, Lottery> map = getRaceLotteryMap(race);
        List<Lottery> list = new ArrayList<Lottery>();
        int total = 3;
        if (race == Race.RANDOM) {
            total = 1;
        }
        boolean[] randomArr = new boolean[map.size()];
        for (int i = total; i > 0;) {
            int id = randomId(map.size());
            if (randomArr[id]) {
                continue;
            }
            randomArr[id] = true;
            list.add(map.get(id));
            i--;
        }
        return list;
    }


    public static void main(String[] args) {
        Main m = new Main();
        List<Lottery> list = m.lottery(Race.PROTOSS);
        m.printList(list);
        /*
        m.print(Race.PROTOSS);
        m.print(Race.ZERG);
        m.print(Race.TERRAN);
        m.print(Race.RANDOM);*/
    }
}
