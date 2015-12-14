package com.example.administrator.mylistviewsidebar.dal;

import com.example.administrator.mylistviewsidebar.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/9 0009.
 */
public class StudentDao implements IStudentDao {

    @Override
    public List<Student> getStudentList(int offset) {

        List<Student> students = new ArrayList<Student>() ;
        List<Student> source = getStudentList();
        for (int i = 0; i < 10 && i < (source.size() - offset); i++) {
            students.add(source.get(i + offset));
            students.get(i).setName(1 + i + offset + " - " + students.get(i).getName());
        }
        return students;

    }

    @Override
    public int getTotalStudentCount() {
        return getStudentList().size() ;
    }

    @Override
    public List<Student> getStudentList() {

        List<Student> heroes = new ArrayList<Student>() ;
        Student hero = new Student() ;

        hero = new Student("疾风剑豪", "jifengjianhao") ;
        heroes.add(hero) ;

        hero = new Student("卡牌大师", "kapaidashi") ;
        heroes.add(hero) ;

        hero = new Student("诡术妖姬", "guishuyaoji") ;
        heroes.add(hero) ;

        hero = new Student("不祥之刃", "buxiangzhiren") ;
        heroes.add(hero) ;

        hero = new Student("沙漠皇帝", "shamohuangdi") ;
        heroes.add(hero) ;

        hero = new Student("远古巫灵", "yuanguwuling") ;
        heroes.add(hero) ;

        hero = new Student("潮汐海灵", "chaoxihailing") ;
        heroes.add(hero) ;

        hero = new Student("暗黑元首", "anheiyuanshou") ;
        heroes.add(hero) ;

        hero = new Student("影流之主", "yingliuzhizhu") ;
        heroes.add(hero) ;

        hero = new Student("刀锋之影", "daofengzhiying") ;
        heroes.add(hero) ;

        hero = new Student("虚空行者", "xukongxingzhe") ;
        heroes.add(hero) ;

        hero = new Student("发条魔灵", "fatiaomoling") ;
        heroes.add(hero) ;

        hero = new Student("魔蛇之拥", "moshezhiyong") ;
        heroes.add(hero) ;

        hero = new Student("哨兵之殇", "shaobingzhishang") ;
        heroes.add(hero) ;

        hero = new Student("黑暗之女", "heianzhinv") ;
        heroes.add(hero) ;

        hero = new Student("虚空之眼", "xukongzhiyan") ;
        heroes.add(hero) ;

        hero = new Student("光辉女郎", "guanghuinvlang") ;
        heroes.add(hero) ;

        hero = new Student("复仇焰魂", "fuchouyanhun") ;
        heroes.add(hero) ;

        hero = new Student("荆棘之兴", "jingjizhixing") ;
        heroes.add(hero) ;

        hero = new Student("大发明家", "dafamingjia") ;
        heroes.add(hero) ;

        hero = new Student("机械先驱", "jixiexianqu") ;
        heroes.add(hero) ;

        hero = new Student("流浪法师", "liulangfashi") ;
        heroes.add(hero) ;

        hero = new Student("堕落天使", "duoluotianshi") ;
        heroes.add(hero) ;

        hero = new Student("爆破鬼才", "baopoguicai") ;
        heroes.add(hero) ;

        hero = new Student("冰霜女巫", "bingshaungnvwu") ;
        heroes.add(hero) ;

        hero = new Student("邪恶小法师", "xieexiaofashi") ;
        heroes.add(hero) ;

        hero = new Student("死亡颂唱者", "siwangsongchangzhe") ;
        heroes.add(hero) ;

        hero = new Student("德玛西亚之力", "demaxiyazhili") ;
        heroes.add(hero) ;

        hero = new Student("德玛西亚皇子", "demaxiyahuangzi") ;
        heroes.add(hero) ;

        hero = new Student("德邦总管", "debangzongguan") ;
        heroes.add(hero) ;

        hero = new Student("诺克萨斯之手", "nuokesasizhishou") ;
        heroes.add(hero) ;

        hero = new Student("龙血武姬", "longxuewuji") ;
        heroes.add(hero) ;

        hero = new Student("荒漠屠夫", "huangmotufu") ;
        heroes.add(hero) ;

        hero = new Student("沙漠死神", "shamosishen") ;
        heroes.add(hero) ;

        hero = new Student("迅捷斥候", "xunjiechihou") ;
        heroes.add(hero) ;

        hero = new Student("暮光之眼", "muguangzhiyan") ;
        heroes.add(hero) ;

        hero = new Student("刀锋意志", "daofengyizhi") ;
        heroes.add(hero) ;

        hero = new Student("武器大师", "wuqidashi") ;
        heroes.add(hero) ;

        hero = new Student("熔岩巨兽", "rongyanjvshou") ;
        heroes.add(hero) ;

        hero = new Student("审判天使", "shenpantianshi") ;
        heroes.add(hero) ;

        hero = new Student("炼金术士", "lianjinshushi") ;
        heroes.add(hero) ;

        hero = new Student("无双剑姬", "wushuangjianji") ;
        heroes.add(hero) ;

        hero = new Student("放逐之刃", "fangzhuzhiren") ;
        heroes.add(hero) ;

        hero = new Student("暗影之拳", "anyingzhiquan") ;
        heroes.add(hero) ;

        hero = new Student("扭曲树精", "niuqushujing") ;
        heroes.add(hero) ;

        hero = new Student("机械公敌", "jixiegongdi") ;
        heroes.add(hero) ;

        hero = new Student("蛮族之王", "manzuzhiwang") ;
        heroes.add(hero) ;

        hero = new Student("海洋之灾", "haiyangzhizai") ;
        heroes.add(hero) ;

        hero = new Student("战争之王", "zhanzhengzhiwang") ;
        heroes.add(hero) ;

        hero = new Student("齐天大圣", "qitiandasheng") ;
        heroes.add(hero) ;

        hero = new Student("狂战士", "kuangzhanshi") ;
        heroes.add(hero) ;

        hero = new Student("钢铁大使", "gangtiedashi") ;
        heroes.add(hero) ;

        hero = new Student("迷失之牙", "mishizhiya") ;
        heroes.add(hero) ;

        hero = new Student("金属大师", "jinshudashi") ;
        heroes.add(hero) ;

        hero = new Student("狂野女猎手", "kuangyenvlieshou") ;
        heroes.add(hero) ;

        hero = new Student("水晶先锋", "shuijingxianfeng") ;
        heroes.add(hero) ;

        hero = new Student("战争之影", "zhanzhengzhiying") ;
        heroes.add(hero) ;

        hero = new Student("巨魔之王", "jvmozhiwang") ;
        heroes.add(hero) ;

        hero = new Student("皮城执法官", "pichengzhifaguan") ;
        heroes.add(hero) ;

        hero = new Student("傲之追猎者", "aozhizhuiliezhe") ;
        heroes.add(hero) ;

        hero = new Student("亡灵战神", "wanglinzhanshen") ;
        heroes.add(hero) ;

        hero = new Student("虚空恐惧", "xukongkongjv") ;
        heroes.add(hero) ;

        hero = new Student("盲僧", "mangseng") ;
        heroes.add(hero) ;

        hero = new Student("狂暴之心", "kuangbaozhixin") ;
        heroes.add(hero) ;

        hero = new Student("虚空掠夺者", "xukonglueduozhe") ;
        heroes.add(hero) ;

        hero = new Student("暗裔剑魔", "anyijianmo") ;
        heroes.add(hero) ;

        hero = new Student("殇之木乃伊", "shangzhimunaiyi") ;
        heroes.add(hero) ;

        hero = new Student("寡妇制造者", "guafuzhizaozhe") ;
        heroes.add(hero) ;

        hero = new Student("虚空遁地兽", "xukongdundishou") ;
        heroes.add(hero) ;

        hero = new Student("蜘蛛女皇", "zhizhunvhuang") ;
        heroes.add(hero) ;

        hero = new Student("雷霆咆哮", "leitingpaoxiao") ;
        heroes.add(hero) ;

        hero = new Student("首领之傲", "shoulingzhiao") ;
        heroes.add(hero) ;

        hero = new Student("探险家", "tanxianjia") ;
        heroes.add(hero) ;

        hero = new Student("瘟疫之源", "wenyizhiyuan") ;
        heroes.add(hero) ;

        hero = new Student("赏金猎人", "sahngjinlieren") ;
        heroes.add(hero) ;

        hero = new Student("寒冰射手", "hanbingsheshou") ;
        heroes.add(hero) ;

        hero = new Student("法外狂徒", "fawaikuangtu") ;
        heroes.add(hero) ;

        hero = new Student("暴走萝莉", "baozouluoli") ;
        heroes.add(hero) ;

        hero = new Student("战争女神", "zhanzhengnvshen") ;
        heroes.add(hero) ;

        hero = new Student("暗夜猎手", "anyelieshou") ;
        heroes.add(hero) ;

        hero = new Student("复仇之矛", "fuchouzhimao") ;
        heroes.add(hero) ;

        hero = new Student("德玛西亚之翼", "demaxiyazhiyi") ;
        heroes.add(hero) ;

        hero = new Student("圣枪游侠", "shengqiangyouxia") ;
        heroes.add(hero) ;

        hero = new Student("麦林炮手", "mailinpaoshou") ;
        heroes.add(hero) ;

        hero = new Student("深渊巨口", "shenyuanjvkou") ;
        heroes.add(hero) ;

        hero = new Student("皮城女警", "pichengnvjing") ;
        heroes.add(hero) ;

        hero = new Student("惩戒之箭", "chengjiezhijian") ;
        heroes.add(hero) ;

        hero = new Student("曙光女神", "shuguangnvshen") ;
        heroes.add(hero) ;

        hero = new Student("魂锁典狱长", "hunsuodianyuzhang") ;
        heroes.add(hero) ;

        hero = new Student("弗雷尔卓德之心", "fuleierzhuodezhixin") ;
        heroes.add(hero) ;

        hero = new Student("星界游神", "xingjieyoushen") ;
        heroes.add(hero) ;

        hero = new Student("河流之王", "heliuzhiwang") ;
        heroes.add(hero) ;

        hero = new Student("众星之子", "zhongxingzhizi") ;
        heroes.add(hero) ;

        hero = new Student("披甲龙龟", "pijialonggui") ;
        heroes.add(hero) ;

        hero = new Student("琴瑟仙女", "qinsexiannv") ;
        heroes.add(hero) ;

        hero = new Student("天启者", "tianqizhe") ;
        heroes.add(hero) ;

        hero = new Student("唤潮鲛姬", "huanchaojiaoji") ;
        heroes.add(hero) ;

        hero = new Student("牛头酋长", "niutouqiuzhang") ;
        heroes.add(hero) ;

        hero = new Student("未来守护者", "weilaishouhuzhe") ;
        heroes.add(hero) ;

        hero = new Student("时光守护者", "shiguangshouhuzhe") ;
        heroes.add(hero) ;

        hero = new Student("宝石骑士", "baoshiqishi") ;
        heroes.add(hero) ;

        hero = new Student("恶魔小丑", "emoxiaochou") ;
        heroes.add(hero) ;

        hero = new Student("永恒梦靥", "yonghengmengye") ;
        heroes.add(hero) ;

        hero = new Student("深海泰坦", "shenhaitaitan") ;
        heroes.add(hero) ;

        hero = new Student("蒸汽机器人", "zhengqijiqiren") ;
        heroes.add(hero) ;

        hero = new Student("生化魔人", "shenghuamoren") ;
        heroes.add(hero) ;

        hero = new Student("冰晶凤凰", "bingjingfenghuang") ;
        heroes.add(hero) ;

        hero = new Student("末日使者", "morishizhe") ;
        heroes.add(hero) ;

        hero = new Student("时间刺客", "shijiancike") ;
        heroes.add(hero) ;

        hero = new Student("仙灵女巫", "xianlingnvwu") ;
        heroes.add(hero) ;

        hero = new Student("风暴之怒", "fengbaozhinu") ;
        heroes.add(hero) ;

        hero = new Student("荣耀行刑官", "rongyaoxingxingguan") ;
        heroes.add(hero) ;

        hero = new Student("无极剑圣", "wujijiansheng") ;
        heroes.add(hero) ;

        hero = new Student("雪人骑士", "xuerenqishi") ;
        heroes.add(hero) ;

        hero = new Student("皎月女神", "jiaoyuenvshen") ;
        heroes.add(hero) ;

        hero = new Student("掘墓者", "juemuzhe") ;
        heroes.add(hero) ;

        hero = new Student("兽灵行者", "shoulingxingzhe") ;
        heroes.add(hero) ;

        hero = new Student("英勇投弹手", "yingyongtoudanshou") ;
        heroes.add(hero) ;

        hero = new Student("祖安狂人", "zuankuangren") ;
        heroes.add(hero) ;

        hero = new Student("酒桶", "jiutong") ;
        heroes.add(hero) ;

        hero = new Student("嗜血猎手", "shixuelieshou") ;
        heroes.add(hero) ;

        hero = new Student("九尾妖狐", "jiuweiyaohu") ;
        heroes.add(hero) ;

        hero = new Student("策士统领", "ceshitongling") ;
        heroes.add(hero) ;

        hero = new Student("凛冬之怒", "lindongzhinu") ;
        heroes.add(hero) ;

        hero = new Student("猩红收割者", "xinghongshougezhe") ;
        heroes.add(hero) ;

        hero = new Student("虚空先知", "xukongxianzhi") ;
        heroes.add(hero) ;

        return heroes ;
    }

}
