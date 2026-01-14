package ksyun.client.kfw.modifyhostbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyHostbookRequest
* @Description 请求参数
*/
@Data
public class ModifyHostbookRequest{
    /**域名簿ID，用于标识要修改的域名簿*/
    @KsYunField(name="HostbookId")
    private String HostbookId;

    /**域名簿名称，最大长度95个字符*/
    @KsYunField(name="HostbookName")
    private String HostbookName;

    /**域名列表，修改时可为空表示不修改域名列表，最多1500个域名，每个域名最长67个字符*/
    @KsYunField(name="HostValue",type=2)
    private List<String> HostValueList;

    /**域名簿描述信息，最大长度255个字符*/
    @KsYunField(name="Description")
    private String Description;

}
