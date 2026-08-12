package ksyun.client.kpfs.describefiledeletepolicylist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileDeletePolicyListRequest
* @Description 请求参数
*/
@Data
public class DescribeFileDeletePolicyListRequest{
    /**文件系统的实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**• 已生效：Enabled
• 已禁用：Disabled
• 已失效：Expired*/
    @KsYunField(name="DeletePolicyStatus")
    private String DeletePolicyStatus;

    /**目录绝对路径*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**文件删除策略ID，中间用“,”隔开，注意：URL参数中如果存在此类特殊符号，需要使用URLEncoder来进行编码*/
    @KsYunField(name="FileDeletePolicyId",type=2)
    private List<String> FileDeletePolicyIdList;

    /**当前页码，默认值1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页数量，值范围：1-1000，默认值：1000*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
