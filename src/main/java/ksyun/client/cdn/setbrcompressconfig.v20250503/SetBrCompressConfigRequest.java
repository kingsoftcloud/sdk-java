package ksyun.client.cdn.setbrcompressconfig.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetBrCompressConfigRequest
* @Description 请求参数
*/
@Data
public class SetBrCompressConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置智能压缩的开启或关闭 取值：on、off ，默认为off*/
    @KsYunField(name="Enable")
    private String Enable;

    /**压缩方式类型，取值：BR：BR压缩； 默认为BR*/
    @KsYunField(name="CompressType")
    private String CompressType;

    /**Content-Type值；支持传入多个，多个取值间用,分割； 默认为所有支持的18个Content-Type值*/
    @KsYunField(name="FileType")
    private String FileType;

    /**压缩文件大小范围，单位Byte，输入格式实例：1024-2048； 默认为1024-31457280
底层参数限制：最小长度：1024 byte，最大长度：31457280 byte*/
    @KsYunField(name="FileSize")
    private String FileSize;

}
