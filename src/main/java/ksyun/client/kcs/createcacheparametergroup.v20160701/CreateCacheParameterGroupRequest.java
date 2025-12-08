package ksyun.client.kcs.createcacheparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateCacheParameterGroupRequest
* @Description 请求参数
*/
@Data
public class CreateCacheParameterGroupRequest{
    /**可用区     	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**参数组名称。 	 支持1-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线。*/
    @KsYunField(name="Name")
    private String Name;

    /**参数组描述。*/
    @KsYunField(name="Description")
    private String Description;

    /**参数组版本。*/
    @KsYunField(name="ParamVersion")
    private String ParamVersion;

    /**参数名称   	 N：表示数字，示例（Parameters.ParameterName.1=xx&Parameters.ParameterName.2=yy）参考请见-[参数组参数](https://docs.ksyun.com/documents/38470)*/
    @KsYunField(name="Parameters",type=2)
    private List<ParametersDto1> ParametersList;

    @Data
    @ToString
    public static class ParametersDto1 {
        /**参数名称   	 N：表示数字，示例（Parameters.ParameterName.1=xx&Parameters.ParameterName.2=yy）参考请见-[参数组参数](https://docs.ksyun.com/documents/38470)*/
        @KsYunField(name="ParameterName")
        private String ParameterName;

        /**参数值     	 N：表示数字，示例（Parameters.ParameterValue.1=xx&Parameters.ParameterValue.2=yy）对应的N的参数名和参数值一一对应*/
        @KsYunField(name="ParameterValue")
        private String ParameterValue;

    }

}
