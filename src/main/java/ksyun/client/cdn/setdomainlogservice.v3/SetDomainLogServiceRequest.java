package ksyun.client.cdn.setdomainlogservice.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetDomainLogServiceRequest
* @Description 请求参数
*/
@Data
public class SetDomainLogServiceRequest{
    /**操作类型，取值为start：启用；stop：停用；modify-granularity：更改日志粒度*/
    @KsYunField(name="ActionType")
    private String ActionType;

    /**需要启用或停用日志服务的域名ID，支持批量域名开启或停用，多个域名ID用逗号（半角）分隔*/
    @KsYunField(name="DomainIds")
    private String DomainIds;

    /**日志存储粒度，取值为5：按5分钟粒度存储；60：按小时粒度存储；1440：按天粒度存储，默认按天粒度存储，此入参在ActionType为stop时为非必填，其余情况为必填*/
    @KsYunField(name="Granularity")
    private String Granularity;

}
