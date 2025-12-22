package ksyun.client.cdn.modifycdndomainbasicinfo.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCdnDomainBasicInfoRequest
* @Description 请求参数
*/
@Data
public class ModifyCdnDomainBasicInfoRequest{
    /**DomainId*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**Regions*/
    @KsYunField(name="Regions")
    private String Regions;

    /**OriginType*/
    @KsYunField(name="OriginType")
    private String OriginType;

    /**OriginProtocol*/
    @KsYunField(name="OriginProtocol")
    private String OriginProtocol;

    /**Origin*/
    @KsYunField(name="Origin")
    private String Origin;

}
