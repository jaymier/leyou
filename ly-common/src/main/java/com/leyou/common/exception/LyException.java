package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created with IDEA
 *
 * @author：JiangYuzhen
 * @date：2019/7/21
 * @time: 22:50
 * @description: TODO
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LyException extends RuntimeException{

    private ExceptionEnum exceptionEnum;

}
