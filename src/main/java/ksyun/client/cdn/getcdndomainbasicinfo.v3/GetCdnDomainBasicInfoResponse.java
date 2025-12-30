package ksyun.client.cdn.getcdndomainbasicinfo.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetCdnDomainBasicInfoResponse
* @Description GetCdnDomainBasicInfo 返回体
*/
@Data
@ToString
public class GetCdnDomainBasicInfoResponse extends BaseResponseModel {

    /**接入CDN进行加速的域名*/
    @JsonProperty("DomainName")
    private String DomainName;

    /**域名ID*/
    @JsonProperty("DomainId")
    private String DomainId;

    /**为加速域名生成的一个CNAME域名，需要在域名解析服务商处将加速域名CNAME解析到该域名*/
    @JsonProperty("Cname")
    private String Cname;

    /**加速域名运行状态*/
    @JsonProperty("DomainStatus")
    private String DomainStatus;

    /**加速域名的产品类型*/
    @JsonProperty("CdnType")
    private String CdnType;

    /**加速业务子类型，业务子类型是为了细分业务，默认不填写，目前作为已废弃的历史遗留字段*/
    @JsonProperty("CdnSubType")
    private String CdnSubType;

    /**域名所属项目ID*/
    @JsonProperty("ProjectId")
    private Integer ProjectId;

    /**域名所属项目名称*/
    @JsonProperty("ProjectName")
    private String ProjectName;

    /**ICP备案号*/
    @JsonProperty("IcpRegistration")
    private String IcpRegistration;

    /**审核失败原因*/
    @JsonProperty("AuditFailReason")
    private String AuditFailReason;

    /**客户访问服务节点的协议。默认http，流媒体直播必须填写：http＋flv，hls，rtmp。当产品类型为大文件下载、音视频点播、图片小文件时，访问协议为http；当产品类型为流媒体直播时，访问协议为http＋flv，hls，rtmp*/
    @JsonProperty("CdnProtocol")
    private String CdnProtocol;

    /**加速区域，支持CN：【中国大陆】；OverSea：【全球（除中国大陆）】；Global：【全球】，缺省为 CN*/
    @JsonProperty("Regions")
    private String Regions;

    /**源站类型 取值：ipaddr、 domain、KS3、ksvideo分别表示：IP源站、域名源站、KS3为源站、金山云视频云源站*/
    @JsonProperty("OriginType")
    private String OriginType;

    /**回源协议，取值：http，https，follow，rtmp，hls，当产品类型为大文件下载、音视频点播、小文件下载时，回源协议为http，https，follow（协议跟随）；当产品类型为流媒体直播时，回源协议为rtmp，hls（注：访问协议为hls时，回源协议必须为hls；访问协议为http+flv和rtmp时，回源协议必须为rtmp）*/
    @JsonProperty("OriginProtocol")
    private String OriginProtocol;

    /**回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入*/
    @JsonProperty("Origin")
    private String Origin;

    /**Http协议回源端口*/
    @JsonProperty("OriginHttpPort")
    private Integer OriginHttpPort;

    /**Https协议回源端口*/
    @JsonProperty("OriginHttpsPort")
    private Integer OriginHttpsPort;

    /**加速域名创建时间，ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @JsonProperty("CreatedTime")
    private String CreatedTime;

    /**加速域名修改时间，ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @JsonProperty("ModifiedTime")
    private String ModifiedTime;

}
