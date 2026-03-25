package ksyun.client.aicp.creatememorycollection.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMemoryCollectionRequest
* @Description 请求参数
*/
@Data
public class CreateMemoryCollectionRequest{
    /**记忆库名称；
40位，允许字母、中文、数字、顿号、-、_、
.、\、/、(、)*/
    @KsYunField(name="Name")
    private String Name;

    /**记忆库描述；
200位，允许字母、中文、数字、顿号、-、_、\、/、(、)、.、空格*/
    @KsYunField(name="Description")
    private String Description;

}
