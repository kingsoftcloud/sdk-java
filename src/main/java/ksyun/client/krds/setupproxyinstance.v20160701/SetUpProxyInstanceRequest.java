package ksyun.client.krds.setupproxyinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetUpProxyInstanceRequest
* @Description 请求参数
*/
@Data
public class SetUpProxyInstanceRequest{
    /**代理实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**只读实例列表*/
    @KsYunField(name="ReadOnlyInstanceList",type=2)
    private List<ReadOnlyInstanceListDto1> ReadOnlyInstanceListList;

    @Data
    @ToString
    public static class ReadOnlyInstanceListDto1 {
        /**只读实例节点ID*/
        @KsYunField(name="Id")
        private String Id;

        /**节点权重*/
        @KsYunField(name="Weight")
        private Integer Weight;

    }

}
