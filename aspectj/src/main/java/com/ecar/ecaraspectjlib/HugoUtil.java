package com.ecar.ecaraspectjlib;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.CodeSignature;

/*
 *===============================================
 *
 * 文件名:${type_name}
 *
 * 描述:   Hugo的工具
 *
 * 作者:
 *
 * 版权所有:深圳市亿车科技有限公司
 *
 * 创建日期: ${date} ${time}
 *
 * 修改人:   金征
 *
 * 修改时间:  ${date} ${time} 
 *
 * 修改备注: 
 *
 * 版本:      v1.0 
 *
 *===============================================
 */
public class HugoUtil {

    //获取当前注解所在的类
    public static Class getCls(ProceedingJoinPoint joinPoint) {
        return joinPoint.getSignature().getDeclaringType();
    }

    //获取当前注解所在方法名
    public static String getMethodName(ProceedingJoinPoint joinPoint) {
        return joinPoint.getSignature().getName();
    }

    //获取当前注解所在方法参数名数组
    public static String[] getParmNames(ProceedingJoinPoint joinPoint) {
        return ((CodeSignature) joinPoint.getSignature()).getParameterNames();
    }

    //获取当前注解所在方法参数值组
    public static Object[] getParmValues(ProceedingJoinPoint joinPoint) {
        return joinPoint.getArgs();
    }
}
