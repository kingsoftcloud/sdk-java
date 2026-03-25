package ksyun.client.aicp.updatememorycollection.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateMemoryCollectionRequest
* @Description 请求参数
*/
@Data
public class UpdateMemoryCollectionRequest{
    /**待修改的记忆库唯一 ID，不可为空*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库描述；
200位，允许字母、中文、数字、顿号、-、_、\、/、(、)、.、空格
不传则不修改原有描述*/
    @KsYunField(name="Description")
    private String Description;

    /**记忆库名称；
40位，允许字母、中文、数字、顿号、-、_、
.、\、/、(、)*/
    @KsYunField(name="Name")
    private String Name;

}
