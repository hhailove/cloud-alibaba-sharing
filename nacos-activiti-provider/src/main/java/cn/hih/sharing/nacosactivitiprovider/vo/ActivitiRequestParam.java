package cn.hih.sharing.nacosactivitiprovider.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @classname: ActivitiRequestParam
 * @description: 工作流请求入参
 * @author: Mr.Huang
 * @date: 2019-03-28 08:55
 **/
@NoArgsConstructor
public class ActivitiRequestParam {
    @Setter @Getter
    private String processId;
    @Setter @Getter
    private Map<String,Object> variables ;
}
