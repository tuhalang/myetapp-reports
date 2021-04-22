/*
 * Generated by JasperReports - 12/16/16 11:17 AM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;

import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.engine.data.*;


/**
 *
 */
public class BorangT2_subreport0_1481858225487_305850 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_ReportDir = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_idPermohonan = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillField field_NILAI_UB_TKHMOHON = null;
    private JRFillField field_JUMLAH_KESELURUHAN_TKHMOHON = null;
    private JRFillField field_TARIKH_RESIT = null;
    private JRFillField field_NILAI_UB_TKHMATI = null;
    private JRFillField field_TARIKH_RESIT_CUKAI = null;
    private JRFillField field_JUMLAH_KESELURUHAN_TKHMATI = null;
    private JRFillField field_AMAUN = null;
    private JRFillField field_NO_RESIT_CUKAI = null;
    private JRFillField field_CUKAI_PUSAKA = null;
    private JRFillField field_NO_RESIT = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_ReportDir = (JRFillParameter)pm.get("ReportDir");
        parameter_REPORT_FILE_RESOLVER = (JRFillParameter)pm.get("REPORT_FILE_RESOLVER");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_idPermohonan = (JRFillParameter)pm.get("idPermohonan");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_NILAI_UB_TKHMOHON = (JRFillField)fm.get("NILAI_UB_TKHMOHON");
        field_JUMLAH_KESELURUHAN_TKHMOHON = (JRFillField)fm.get("JUMLAH_KESELURUHAN_TKHMOHON");
        field_TARIKH_RESIT = (JRFillField)fm.get("TARIKH_RESIT");
        field_NILAI_UB_TKHMATI = (JRFillField)fm.get("NILAI_UB_TKHMATI");
        field_TARIKH_RESIT_CUKAI = (JRFillField)fm.get("TARIKH_RESIT_CUKAI");
        field_JUMLAH_KESELURUHAN_TKHMATI = (JRFillField)fm.get("JUMLAH_KESELURUHAN_TKHMATI");
        field_AMAUN = (JRFillField)fm.get("AMAUN");
        field_NO_RESIT_CUKAI = (JRFillField)fm.get("NO_RESIT_CUKAI");
        field_CUKAI_PUSAKA = (JRFillField)fm.get("CUKAI_PUSAKA");
        field_NO_RESIT = (JRFillField)fm.get("NO_RESIT");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(new java.lang.Integer((((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getValue()).intValue()) -(((java.lang.Integer)field_NILAI_UB_TKHMATI.getValue()).intValue())));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)((((java.lang.String)field_NO_RESIT_CUKAI.getValue())!=null && !((java.lang.String)field_NO_RESIT_CUKAI.getValue()).equals("0") ?"RM " + ((java.lang.String)field_CUKAI_PUSAKA.getValue()):"TIADA"));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(new java.lang.Integer(  (((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getValue()).intValue())- (((java.lang.Integer)field_NILAI_UB_TKHMOHON.getValue()).intValue())));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMATI.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMOHON.getValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Boolean)(new Boolean(!((java.lang.String)field_NO_RESIT_CUKAI.getValue()).equals(null)));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)(" ( No.Resit : " + ((java.lang.String)field_NO_RESIT_CUKAI.getValue()) + ", Tkh. Resit " + ((java.lang.String)field_TARIKH_RESIT_CUKAI.getValue())+")");//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(((java.lang.String)parameter_idPermohonan.getValue()));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.sql.Connection)(((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.String)(((java.lang.String)parameter_ReportDir.getValue()) + "\\ppk\\BorangT_subreportByrnPerintah.jasper");//$JR_EXPR_ID=19$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(new java.lang.Integer((((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getOldValue()).intValue()) -(((java.lang.Integer)field_NILAI_UB_TKHMATI.getOldValue()).intValue())));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)((((java.lang.String)field_NO_RESIT_CUKAI.getOldValue())!=null && !((java.lang.String)field_NO_RESIT_CUKAI.getOldValue()).equals("0") ?"RM " + ((java.lang.String)field_CUKAI_PUSAKA.getOldValue()):"TIADA"));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(new java.lang.Integer(  (((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getOldValue()).intValue())- (((java.lang.Integer)field_NILAI_UB_TKHMOHON.getOldValue()).intValue())));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMATI.getOldValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMOHON.getOldValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getOldValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getOldValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Boolean)(new Boolean(!((java.lang.String)field_NO_RESIT_CUKAI.getOldValue()).equals(null)));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)(" ( No.Resit : " + ((java.lang.String)field_NO_RESIT_CUKAI.getOldValue()) + ", Tkh. Resit " + ((java.lang.String)field_TARIKH_RESIT_CUKAI.getOldValue())+")");//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(((java.lang.String)parameter_idPermohonan.getValue()));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.sql.Connection)(((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.String)(((java.lang.String)parameter_ReportDir.getValue()) + "\\ppk\\BorangT_subreportByrnPerintah.jasper");//$JR_EXPR_ID=19$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.String)(new java.lang.Integer((((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getValue()).intValue()) -(((java.lang.Integer)field_NILAI_UB_TKHMATI.getValue()).intValue())));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.String)((((java.lang.String)field_NO_RESIT_CUKAI.getValue())!=null && !((java.lang.String)field_NO_RESIT_CUKAI.getValue()).equals("0") ?"RM " + ((java.lang.String)field_CUKAI_PUSAKA.getValue()):"TIADA"));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(new java.lang.Integer(  (((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getValue()).intValue())- (((java.lang.Integer)field_NILAI_UB_TKHMOHON.getValue()).intValue())));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMATI.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_NILAI_UB_TKHMOHON.getValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMATI.getValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)(((java.lang.Integer)field_JUMLAH_KESELURUHAN_TKHMOHON.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Boolean)(new Boolean(!((java.lang.String)field_NO_RESIT_CUKAI.getValue()).equals(null)));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)(" ( No.Resit : " + ((java.lang.String)field_NO_RESIT_CUKAI.getValue()) + ", Tkh. Resit " + ((java.lang.String)field_TARIKH_RESIT_CUKAI.getValue())+")");//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(((java.lang.String)parameter_idPermohonan.getValue()));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.sql.Connection)(((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.String)(((java.lang.String)parameter_ReportDir.getValue()) + "\\ppk\\BorangT_subreportByrnPerintah.jasper");//$JR_EXPR_ID=19$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}