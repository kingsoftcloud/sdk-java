package ksyun.client.epc.describesoimages.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoImagesRequest
* @Description 请求参数
*/
@Data
public class DescribeSoImagesRequest{
    /**镜像的ID，最多支持100个ID。
• 参数 - N：表示镜像ID的序号。
• 多个镜像ID之间用&分隔。*/
    @KsYunField(name="ImageId")
    private List<String> ImageIdList;

    /**镜像名称。*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**镜像是否支持Cloud-init。取值：
• true：支持
• false：不支持*/
    @KsYunField(name="IsSupportCloudInit")
    private Boolean IsSupportCloudInit;

    /**分页查询时设置的每页行数。
• 取值范围：1 ~ 100
• 默认值：15*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页查询凭证，用于标记分页的位置，初次调用该接口时无需设置。下次查询时，取值为上一次API调用返回的NextToken参数值。*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**操作系统类型。取值：
• Linux
• Windows*/
    @KsYunField(name="OsType")
    private String OsType;

    /**镜像操作系统的发行版本。取值：
• CentOS
• Debian
• Windows Server
• Ubuntu*/
    @KsYunField(name="Platform")
    private String Platform;

    /**镜像状态，最多支持10个。取值：
• available（默认）：可用
• creating：创建中
• error：错误
说明
• 参数 - N：表示镜像状态的序号。
• 多个镜像状态之间用&分隔。*/
    @KsYunField(name="Status")
    private List<String> StatusList;

    /**镜像的可见性。取值：
• public：公共镜像
• private：自定义镜像*/
    @KsYunField(name="Visibility")
    private String Visibility;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}