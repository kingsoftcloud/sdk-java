package ksyun.client.cdn.addcdndomain.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddCdnDomainRequest
* @Description 请求参数
*/
@Data
public class AddCdnDomainRequest{
    /**需要接入CDN的域名*/
    @KsYunField(name="DomainName")
    private String DomainName;

    /**加速域名的产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件，live：流媒体直播，暂不支持直播域名添加*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**加速域名所属的项目，非必填项，默认归属为【默认项目】，若输入项目ID，可指定域名归属为已经创建好的项目ID下面*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**客户访问服务节点的协议。默认http，流媒体直播必须填写：http＋flv，hls，rtmp。当产品类型为大文件下载、音视频点播、图片小文件时，访问协议为http；当产品类型为流媒体直播时，访问协议为http＋flv，hls，rtmp*/
    @KsYunField(name="CdnProtocol")
    private String CdnProtocol;

    /**加速区域，支持CN：【中国大陆】；OverSea：【全球（除中国大陆）】；Global：【全球】，缺省为 CN*/
    @KsYunField(name="Regions")
    private String Regions;

    /**源站类型 取值：ipaddr、 domain、KS3、ksvideo分别表示：IP源站、域名源站、KS3为源站、金山云视频云源站。当产品类型为下载时，源站类型为ipaddr、 domain、KS3；当产品类型为直播时，源站类型为ipaddr、 domain、ksvideo；当源站类型为KS3时，需添加以ksyun.com结尾的域名*/
    @KsYunField(name="OriginType")
    private String OriginType;

    /**回源协议，取值：http，https，follow，rtmp，hls，当产品类型为大文件下载、音视频点播时，回源协议为http，https，follow（协议跟随）；当产品类型为流媒体直播时，回源协议为rtmp，hls（注：访问协议为hls时，回源协议必须为hls；访问协议为http+flv和rtmp时，回源协议必须为rtmp）*/
    @KsYunField(name="OriginProtocol")
    private String OriginProtocol;

    /**回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。当源站类型选择ipaddr时，仅可输入IP地址，当源站类型选择 domain、KS3、ksvideo时，仅可输入域名*/
    @KsYunField(name="Origin")
    private String Origin;

}
