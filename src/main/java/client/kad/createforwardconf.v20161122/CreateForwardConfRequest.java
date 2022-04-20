package client.kad.createforwardconf.v20161122;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateForwardConfRequest
* @Description 请求参数
*/
@Data
public class CreateForwardConfRequest{
    /**高防服务实例ID*/
    @KsYunField(name="KadId")
    private String KadId;

    /**转发协议类型，有效值可选TCP或UDP
*/
    @KsYunField(name="Protocol")
    private String Protocol;

    /**服务端口，有效值范围10~65535*/
    @KsYunField(name="ServicePort")
    private Integer ServicePort;


}