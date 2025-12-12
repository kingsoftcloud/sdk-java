package ksyun.client.cdn.getcdndomains.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetCdnDomainsRequest
 * @Description 请求参数
 */
@Data
public class GetCdnDomainsRequest {
    /**
     * 分页大小，默认20，最大500，取值1～500间整数
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 取第几页。默认为1，取值1～10000
     */
    @KsYunField(name = "PageNumber")
    private Integer PageNumber;

    /**
     * 按域名过滤，默认为空，为空时代表当前用户下所有域名，域名长度最大255，不支持多个域名同时查询
     */
    @KsYunField(name = "DomainName")
    private String DomainName;

    /**
     * 查询指定项目下的域名。默认为空，为空时查询当前用户下所有域名ProjectId可至金山云控制台-资源管理-项目管理查询
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /**
     * 按域名状态过滤。默认为空，为空时查询当前用户下所有域名的全部状态，取值为：online：正在运行；offline：已停止；configuring：配置中；configure_failed：配置失败 ；icp_checking：审核中；icp_check_failed：审核失败；locked：已封禁；locking：封禁中
     */
    @KsYunField(name = "DomainStatus")
    private String DomainStatus;

    /**
     * 产品类型：file：大文件下载，video：音视频点播，page：图片小文件，wcdn：全站加速，默认为空，代表当前用户下全部产品类型（包括wcdn产品，不支持live：流媒体直播），支持同时查询多个产品类型，两个类型之间用英文逗号（半角）隔开
     */
    @KsYunField(name = "CdnType")
    private String CdnType;

    /**
     * 域名过滤是否使用模糊匹配，取值为on：开启，off：关闭，默认为onon
     */
    @KsYunField(name = "FuzzyMatch")
    private String FuzzyMatch;

}
