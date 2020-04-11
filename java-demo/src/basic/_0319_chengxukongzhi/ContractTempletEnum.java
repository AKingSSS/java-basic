package basic._0319_chengxukongzhi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName StatusEnum
 * @Description
 * @Author yangkang
 * @Date 2020/3/19 14:35
 * @Version 1.0
 **/
public enum ContractTempletEnum {
    PPT(1,"普通模板"),SIGNT(2,"签约模板");
    private Integer id;
    private String name;

    private ContractTempletEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 转换list
     * @return
     */
    public static List<Map<String, Object>> toList(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        ContractTempletEnum[] contractTempletEnum = ContractTempletEnum.values();
        for(ContractTempletEnum e : contractTempletEnum) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", e.getId());
            map.put("name", e.getName());
            list.add(map);
        }
        return list;
    }


    public static ContractTempletEnum getById(Integer id){
        for(ContractTempletEnum transactType : values()){
            if (transactType.getId() == id) {
                //获取指定的枚举
                return transactType;
            }
        }
        return null;
    }

}
