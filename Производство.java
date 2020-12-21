package Лог;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.fluid.*;
import com.anylogic.libraries.modules.markup_descriptors.*;

import com.querydsl.core.Tuple;
import com.querydsl.sql.SQLBindings;
import static пробавперёд.DBDescriptor.*;

import java.awt.geom.Arc2D;

public class Производство extends Agent
{
  // Параметры

  public 
String  производство;

  /**
   * Возвращает значение по умолчанию параметра <code>производство</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _производство_DefaultValue_xjal() {
    final Производство self = this;
    return null;
  }

  public void set_производство( String value ) {
    if (value == this.производство) {
      return;
    }
    String _oldValue_xjal = this.производство;
    this.производство = value;
    onChange_производство_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter производство.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_производство()</code> method instead.
   */
  protected void onChange_производство() {
    onChange_производство_xjal( производство );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_производство_xjal( String oldValue ) {  
  }


  public 
String  адрес;

  /**
   * Возвращает значение по умолчанию параметра <code>адрес</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _адрес_DefaultValue_xjal() {
    final Производство self = this;
    return null;
  }

  public void set_адрес( String value ) {
    if (value == this.адрес) {
      return;
    }
    String _oldValue_xjal = this.адрес;
    this.адрес = value;
    onChange_адрес_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter адрес.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_адрес()</code> method instead.
   */
  protected void onChange_адрес() {
    onChange_адрес_xjal( адрес );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_адрес_xjal( String oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    производство = _производство_DefaultValue_xjal();
    адрес = _адрес_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "производство":
      if ( _callOnChange_xjal ) {
        set_производство( (String) _value_xjal );
      } else {
        производство = (String) _value_xjal;
      }
      return true;
    case "адрес":
      if ( _callOnChange_xjal ) {
        set_адрес( (String) _value_xjal );
      } else {
        адрес = (String) _value_xjal;
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "производство": _result_xjal = производство; break;
    case "адрес": _result_xjal = адрес; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "производство" );
      list.add( "адрес" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Производство.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Области
  public ViewArea _origin_VA = new ViewArea( this, "[Нач. координат]", 0, 0, 1440.0, 900.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  protected static final Color __ps287_Fill_Color = new Color( 0x50000000, true );
  protected static final Color __ps288_Fill_Color = new Color( 0xFFD13B00, true );
  protected static final Color __ps289_Fill_Color = new Color( 0xFFF84000, true );
  protected static final Color __ps290_Fill_Color = new Color( 0xFFBC2300, true );
  protected static final Color __ps291_Fill_Color = new Color( 0xFFBC2300, true );
  protected static final Color __ps292_Fill_Color = new Color( 0xFFF84000, true );
  protected static final Color __ps293_Fill_Color = new Color( 0xFFBC2300, true );
  protected static final Color __ps294_Fill_Color = new Color( 0xFF761200, true );
  protected static final Color __ps295_Fill_Color = new Color( 0xFF761200, true );
  protected static final Color __ps296_Fill_Color = new Color( 0xFF761200, true );
  protected static final Color __ps297_Line_Color = new Color( 0xFF460800, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps287 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps288 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps289 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps290 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps291 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps292 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps293 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps294 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps295 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps296 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps297 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _factory = 12;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 13;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps287_pointsDX_xjal() {
    return new double[] { 0.0, 3.351, 2.234, 5.585, 4.468, 7.819, 6.701, 7.819, 8.935, 10.052, 8.935, 8.935, 6.701, -2.234,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps287_pointsDY_xjal() {
    return new double[] { 0.0, -0.603, -1.208, -1.811, -2.414, -3.017, -3.621, -3.621, -3.017, -3.621, -4.225, -4.828, -6.036, -1.208,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps287_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps288_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 6.701, 6.701,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps288_pointsDY_xjal() {
    return new double[] { 0.0, -3.621, 0.0, 3.621,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps288_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps289_pointsDX_xjal() {
    return new double[] { 0.0, -2.234, -2.234,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps289_pointsDY_xjal() {
    return new double[] { 0.0, -1.208, 1.208,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps289_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps290_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, -2.234, -2.234, -2.234, -2.234, -2.234, -2.234, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps290_pointsDY_xjal() {
    return new double[] { 0.0, 1.208, 1.208, 0.0, 0.0, -6.036, -6.639, -7.241, -7.241, -6.639, -6.639, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps290_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps291_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, -2.234, -2.234, -2.234, -2.234, -2.234, -2.234, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps291_pointsDY_xjal() {
    return new double[] { 0.0, 1.208, 1.208, 0.0, 0.0, -6.036, -6.639, -7.241, -7.241, -6.639, -6.639, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps291_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps292_pointsDX_xjal() {
    return new double[] { 0.0, -6.701, -4.468, -3.351, -2.234, -1.117, 0.0, 6.701, 6.701,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps292_pointsDY_xjal() {
    return new double[] { 0.0, -3.621, -7.241, -6.639, -8.449, -7.847, -9.657, -6.036, -3.621,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps292_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps293_pointsDX_xjal() {
    return new double[] { 0.0, 8.935, 8.935, 6.701, 6.701, 4.468, 4.468, 2.234, 2.234, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps293_pointsDY_xjal() {
    return new double[] { 0.0, -4.828, -8.449, -7.241, -9.657, -6.036, -8.449, -4.828, -7.241, -3.621,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps293_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps294_pointsDX_xjal() {
    return new double[] { 0.0, 1.117, 1.117, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps294_pointsDY_xjal() {
    return new double[] { 0.0, -0.603, -2.414, -1.811,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps294_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps295_pointsDX_xjal() {
    return new double[] { 0.0, 1.117, 1.117, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps295_pointsDY_xjal() {
    return new double[] { 0.0, -0.603, -2.414, -1.811,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps295_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps296_pointsDX_xjal() {
    return new double[] { 0.0, 1.117, 1.117, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps296_pointsDY_xjal() {
    return new double[] { 0.0, -0.603, -2.414, -1.811,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps296_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps297_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, -8.934, -8.934, -8.934, -15.635, -15.635, -15.635, -15.635, -15.635, -15.635, -13.401, -13.401, -13.401, -12.284, -12.284, -12.284, -11.167, -11.167, -11.167, -10.05, -10.05, -10.05, -8.934, -8.934, -8.934, -7.819, -7.819, -7.819, -7.819, -7.819, -7.819, -5.585, -5.585, -5.585, -5.585, -5.585, -5.585, -4.468, -4.468, -4.468, -4.468, -4.468, -4.468, -2.234, -2.234, -2.234, -2.234, -2.234, -2.234, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps297_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 3.621, 3.621, 3.621, 8.449, 8.449, 8.449, 4.828, 4.828, 4.828, 1.208, 1.208, 1.208, -2.414, -2.414, -2.414, -1.811, -1.811, -1.811, -3.621, -3.621, -3.621, -3.017, -3.017, -3.017, -4.828, -4.828, -4.828, -4.225, -4.225, -4.225, -7.847, -8.449, -9.052, -9.052, -8.449, -7.847, -3.017, -3.017, -3.017, -2.414, -2.414, -2.414, -6.036, -6.639, -7.241, -7.241, -6.639, -6.036, -1.208, -1.208, -1.208, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps297_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(factory);
  }

  protected ShapePolyLine _ps287;
  protected ShapePolyLine _ps288;
  protected ShapePolyLine _ps289;
  protected ShapeCurve _ps290;
  protected ShapeCurve _ps291;
  protected ShapePolyLine _ps292;
  protected ShapePolyLine _ps293;
  protected ShapePolyLine _ps294;
  protected ShapePolyLine _ps295;
  protected ShapePolyLine _ps296;
  protected ShapeCurve _ps297;
  protected ShapeGroup factory;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps287 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 9.052, 0.0, null, __ps287_Fill_Color,
            14, __ps287_pointsDX_xjal(), __ps287_pointsDY_xjal(), __ps287_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps288 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -8.934, 4.225, 0.0, null, __ps288_Fill_Color,
            4, __ps288_pointsDX_xjal(), __ps288_pointsDY_xjal(), __ps288_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps289 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 6.701, -0.603, 0.0, null, __ps289_Fill_Color,
            3, __ps289_pointsDX_xjal(), __ps289_pointsDY_xjal(), __ps289_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps290 = new ShapeCurve(
      true,1.117, -2.414, 
      null, __ps290_Fill_Color,
      12, true, __ps290_pointsDX_xjal(), __ps290_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps291 = new ShapeCurve(
      true,4.468, -0.603, 
      null, __ps291_Fill_Color,
      12, true, __ps291_pointsDX_xjal(), __ps291_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps292 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.234, 4.225, 0.0, null, __ps292_Fill_Color,
            9, __ps292_pointsDX_xjal(), __ps292_pointsDY_xjal(), __ps292_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps293 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.234, 7.847, 0.0, null, __ps293_Fill_Color,
            10, __ps293_pointsDX_xjal(), __ps293_pointsDY_xjal(), __ps293_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps294 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 6.639, 0.0, null, __ps294_Fill_Color,
            4, __ps294_pointsDX_xjal(), __ps294_pointsDY_xjal(), __ps294_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps295 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 2.234, 5.432, 0.0, null, __ps295_Fill_Color,
            4, __ps295_pointsDX_xjal(), __ps295_pointsDY_xjal(), __ps295_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps296 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 4.468, 4.225, 0.0, null, __ps296_Fill_Color,
            4, __ps296_pointsDX_xjal(), __ps296_pointsDY_xjal(), __ps296_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps297 = new ShapeCurve(
      true,6.701, -0.603, 
      __ps297_Line_Color, null,
      54, true, __ps297_pointsDX_xjal(), __ps297_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    factory = new ShapeGroup( Производство.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps287
	     , _ps288
	     , _ps289
	     , _ps290
	     , _ps291
	     , _ps292
	     , _ps293
	     , _ps294
	     , _ps295
	     , _ps296
	     , _ps297 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Статическая инициализация элементов, у которых разрешено программное управление
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  /**
   * Конструктор
   */
  public Производство( Engine engine, Agent owner, AgentList<? extends Производство> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Производство() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Производство( String производство, String адрес ) {
    markParametersAreSet();
    this.производство = производство;
    this.адрес = адрес;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Производство_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Производство.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Производство.this, getElementProperty( "пробавперёд.Производство.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Соединители с нереплицированными объектами
    // Создание реплицированных вложенных объектов
    setupInitialConditions_xjal( Производство.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Производство_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Производство_xjal() {
  }

  // API пользователя -----------------------------------------------------
  /**
   * Переменная только для чтения. <em>Значение переменной не должно изменяться пользователем.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient пробавперёд.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Производство> getPopulation() {
    return (AgentList<? extends Производство>) super.getPopulation();
  }

  public List<? extends Производство> agentsInRange( double distance ) {
    return (List<? extends Производство>) super.agentsInRange( distance );
  }



}
