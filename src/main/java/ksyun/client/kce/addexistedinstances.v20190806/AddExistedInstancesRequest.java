package ksyun.client.kce.addexistedinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddExistedInstancesRequest
* @Description 请求参数
*/
@Data
public class AddExistedInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**选择已有的虚拟机（包含专属云主机）作为集群的Worker节点，其中NodeRole只能是Worker。<br>N：1-99*/
    @KsYunField(name="ExistedInstanceKecSet")
    private List<ExistedInstanceKecSetDto> ExistedInstanceKecSetList;

    @Data
    @ToString
    public static class ExistedInstanceKecSetDto {
        /**节点角色,有效值：Worker*/
        @KsYunField(name="NodeRole")
        private String NodeRole;
        /**云服务器产品重新安装实例操作系统的透传参数，json化字符串格式，详见主机更换或者重新安装实例操作接口ModifyInstanceImage。
注意：接口中的ImageId参数替换为支持的节点操作系统，可调用容器的DescribeInstanceImage接口，获取容器服务支持的节点操作系统*/
        @KsYunField(name="KecPara")
        private List<String> KecParaList;
    }


}