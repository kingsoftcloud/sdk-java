package ksyun.client.kcs.setcacheparameters.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetCacheParametersRequest
 * @Description 请求参数
 */
@Data
public class SetCacheParametersRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID 	 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 参数组版本 	 参数组版本，版本号：4.0，5.0
     */
    @KsYunField(name = "Protocol")
    private String Protocol;

    /**
     * 参数名称   	 N：表示数字，示例（Parameters.ParameterName.1=xx&Parameters.ParameterName.2=yy）参考请见：[参数组参数](https://docs.ksyun.com/documents/38470)(默认不修改)
     */
    @KsYunField(name = "Parameters.ParameterName")
    private List<String> ParametersParameterNameList;

    /**
     * 参数值 N：表示数字，示例（Parameters.ParameterValue.1=xx&Parameters.ParameterValue.2=yy）参考请见：参数组参数(默认不修改)
     */
    @KsYunField(name = "Parameters.ParameterValue")
    private List<String> ParametersParameterValueList;

    /**
     * 是否为重置参数 	 默认：false；重置实例参数时修改为true，参数值/参数名不传
     */
    @KsYunField(name = "ResetAllParameters")
    private Boolean ResetAllParameters;

}