package ksyun.client.kcs.modifycacheparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCacheParameterGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyCacheParameterGroupRequest{
    /**可用区     	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**参数组名称 	 支持1-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线*/
    @KsYunField(name="Name")
    private String Name;

    /**参数组描述 	 参数组描述*/
    @KsYunField(name="Description")
    private String Description;

    /**参数组版本。 必须和修改前保持一致*/
    @KsYunField(name="ParamVersion")
    private String ParamVersion;

    /**参数组ID   	 参数组ID*/
    @KsYunField(name="CacheParameterGroupId")
    private String CacheParameterGroupId;

    /**参数名称   	 N：表示数字，示例（Parameters.ParameterName.1=xx&Parameters.ParameterName.2=yy）参考请见 - [参数组参数](https://docs.ksyun.com/documents/38470)*/
    @KsYunField(name="Parameters",type=2)
    private List<ParametersDto1> ParametersList;

    @Data
    @ToString
    public static class ParametersDto1 {
        /**参数名称   	 N：表示数字，示例（Parameters.ParameterName.1=xx&Parameters.ParameterName.2=yy）参考请见 - [参数组参数](https://docs.ksyun.com/documents/38470)*/
        @KsYunField(name="ParameterName")
        private String ParameterName;

        /**参数值     	 N：表示数字，示例（Parameters.ParameterValue.1=xx&Parameters.ParameterValue.2=yy）对应的N的参数名和参数值一一对应*/
        @KsYunField(name="ParameterValue")
        private String ParameterValue;

    }

}
