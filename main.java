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

import java.text.SimpleDateFormat; 

public class Main extends Agent
{
  // Параметры

  public 
int  колвоГрузовиков;

  /**
   * Возвращает значение по умолчанию параметра <code>колвоГрузовиков</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _колвоГрузовиков_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT количество FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
  }

  public void set_колвоГрузовиков( int value ) {
    if (value == this.колвоГрузовиков) {
      return;
    }
    int _oldValue_xjal = this.колвоГрузовиков;
    this.колвоГрузовиков = value;
    onChange_колвоГрузовиков_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter колвоГрузовиков.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_колвоГрузовиков()</code> method instead.
   */
  protected void onChange_колвоГрузовиков() {
    onChange_колвоГрузовиков_xjal( колвоГрузовиков );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_колвоГрузовиков_xjal( int oldValue ) {  
  }


  public 
int  колвоМашин;

  /**
   * Возвращает значение по умолчанию параметра <code>колвоМашин</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _колвоМашин_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT количество FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Машина"
) 
;
  }

  public void set_колвоМашин( int value ) {
    if (value == this.колвоМашин) {
      return;
    }
    int _oldValue_xjal = this.колвоМашин;
    this.колвоМашин = value;
    onChange_колвоМашин_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter колвоМашин.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_колвоМашин()</code> method instead.
   */
  protected void onChange_колвоМашин() {
    onChange_колвоМашин_xjal( колвоМашин );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_колвоМашин_xjal( int oldValue ) {  
  }


  public 
double  вместимость_грузовик;

  /**
   * Возвращает значение по умолчанию параметра <code>вместимость_грузовик</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _вместимость_грузовик_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT вместимость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
  }

  public void set_вместимость_грузовик( double value ) {
    if (value == this.вместимость_грузовик) {
      return;
    }
    double _oldValue_xjal = this.вместимость_грузовик;
    this.вместимость_грузовик = value;
    onChange_вместимость_грузовик_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter вместимость_грузовик.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_вместимость_грузовик()</code> method instead.
   */
  protected void onChange_вместимость_грузовик() {
    onChange_вместимость_грузовик_xjal( вместимость_грузовик );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_вместимость_грузовик_xjal( double oldValue ) {  
  }


  public 
double  вместимость_машина;

  /**
   * Возвращает значение по умолчанию параметра <code>вместимость_машина</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _вместимость_машина_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT вместимость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Машина"
) 
;
  }

  public void set_вместимость_машина( double value ) {
    if (value == this.вместимость_машина) {
      return;
    }
    double _oldValue_xjal = this.вместимость_машина;
    this.вместимость_машина = value;
    onChange_вместимость_машина_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter вместимость_машина.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_вместимость_машина()</code> method instead.
   */
  protected void onChange_вместимость_машина() {
    onChange_вместимость_машина_xjal( вместимость_машина );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_вместимость_машина_xjal( double oldValue ) {  
  }


  public 
int  скоростьГрузовиков;

  /**
   * Возвращает значение по умолчанию параметра <code>скоростьГрузовиков</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _скоростьГрузовиков_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT скорость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
  }

  public void set_скоростьГрузовиков( int value ) {
    if (value == this.скоростьГрузовиков) {
      return;
    }
    int _oldValue_xjal = this.скоростьГрузовиков;
    this.скоростьГрузовиков = value;
    onChange_скоростьГрузовиков_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter скоростьГрузовиков.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_скоростьГрузовиков()</code> method instead.
   */
  protected void onChange_скоростьГрузовиков() {
    onChange_скоростьГрузовиков_xjal( скоростьГрузовиков );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_скоростьГрузовиков_xjal( int oldValue ) {  
  }


  public 
int  скоростьМашин;

  /**
   * Возвращает значение по умолчанию параметра <code>скоростьМашин</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _скоростьМашин_DefaultValue_xjal() {
    final Main self = this;
    return 
(int) selectUniqueValue(int.class,
	"SELECT скорость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Машина"
) 
;
  }

  public void set_скоростьМашин( int value ) {
    if (value == this.скоростьМашин) {
      return;
    }
    int _oldValue_xjal = this.скоростьМашин;
    this.скоростьМашин = value;
    onChange_скоростьМашин_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter скоростьМашин.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_скоростьМашин()</code> method instead.
   */
  protected void onChange_скоростьМашин() {
    onChange_скоростьМашин_xjal( скоростьМашин );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_скоростьМашин_xjal( int oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    колвоГрузовиков = _колвоГрузовиков_DefaultValue_xjal();
    колвоМашин = _колвоМашин_DefaultValue_xjal();
    вместимость_грузовик = _вместимость_грузовик_DefaultValue_xjal();
    вместимость_машина = _вместимость_машина_DefaultValue_xjal();
    скоростьГрузовиков = _скоростьГрузовиков_DefaultValue_xjal();
    скоростьМашин = _скоростьМашин_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "колвоГрузовиков":
      if ( _callOnChange_xjal ) {
        set_колвоГрузовиков( ((Number) _value_xjal).intValue() );
      } else {
        колвоГрузовиков = ((Number) _value_xjal).intValue();
      }
      return true;
    case "колвоМашин":
      if ( _callOnChange_xjal ) {
        set_колвоМашин( ((Number) _value_xjal).intValue() );
      } else {
        колвоМашин = ((Number) _value_xjal).intValue();
      }
      return true;
    case "вместимость_грузовик":
      if ( _callOnChange_xjal ) {
        set_вместимость_грузовик( ((Number) _value_xjal).doubleValue() );
      } else {
        вместимость_грузовик = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "вместимость_машина":
      if ( _callOnChange_xjal ) {
        set_вместимость_машина( ((Number) _value_xjal).doubleValue() );
      } else {
        вместимость_машина = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "скоростьГрузовиков":
      if ( _callOnChange_xjal ) {
        set_скоростьГрузовиков( ((Number) _value_xjal).intValue() );
      } else {
        скоростьГрузовиков = ((Number) _value_xjal).intValue();
      }
      return true;
    case "скоростьМашин":
      if ( _callOnChange_xjal ) {
        set_скоростьМашин( ((Number) _value_xjal).intValue() );
      } else {
        скоростьМашин = ((Number) _value_xjal).intValue();
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
    case "колвоГрузовиков": _result_xjal = колвоГрузовиков; break;
    case "колвоМашин": _result_xjal = колвоМашин; break;
    case "вместимость_грузовик": _result_xjal = вместимость_грузовик; break;
    case "вместимость_машина": _result_xjal = вместимость_машина; break;
    case "скоростьГрузовиков": _result_xjal = скоростьГрузовиков; break;
    case "скоростьМашин": _result_xjal = скоростьМашин; break;
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
      list.add( "колвоГрузовиков" );
      list.add( "колвоМашин" );
      list.add( "вместимость_грузовик" );
      list.add( "вместимость_машина" );
      list.add( "скоростьГрузовиков" );
      list.add( "скоростьМашин" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Простые переменные

  public 
int 
 кодСкладЗаказ;
  public 
int 
 кодСкладНазначение;
  public 
double 
 объёмЗаказ;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }


  // События
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _data_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _data1_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart1_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart3_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot1_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot2_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart4_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _data_autoUpdateEvent_xjal ) return "data auto update event";
     if( _e == _data1_autoUpdateEvent_xjal ) return "data1 auto update event";
     if( _e == _chart_autoUpdateEvent_xjal ) return "chart auto update event";
     if( _e == _chart1_autoUpdateEvent_xjal ) return "chart1 auto update event";
     if( _e == _chart3_autoUpdateEvent_xjal ) return "chart3 auto update event";
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
     if( _e == _plot1_autoUpdateEvent_xjal ) return "plot1 auto update event";
     if( _e == _plot2_autoUpdateEvent_xjal ) return "plot2 auto update event";
     if( _e == _chart4_autoUpdateEvent_xjal ) return "chart4 auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _data_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _data1_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _chart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _chart1_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _chart3_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _plot1_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _plot2_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _chart4_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _data_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _data1_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _chart1_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _chart3_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _plot1_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _plot2_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if ( _e == _chart4_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _data_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _data1_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _chart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _chart1_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _chart3_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _plot_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _plot1_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _plot2_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    if( _e == _chart4_autoUpdateEvent_xjal) {
      _t = 
5 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _data_autoUpdateEvent_xjal ) {
      data.update();
      return;
    }
    if ( _e == _data1_autoUpdateEvent_xjal ) {
      data1.update();
      return;
    }
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      chart.updateData();
      return;
    }
    if ( _e == _chart1_autoUpdateEvent_xjal ) {
      chart1.updateData();
      return;
    }
    if ( _e == _chart3_autoUpdateEvent_xjal ) {
      chart3.updateData();
      return;
    }
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    if ( _e == _plot1_autoUpdateEvent_xjal ) {
      plot1.updateData();
      return;
    }
    if ( _e == _plot2_autoUpdateEvent_xjal ) {
      plot2.updateData();
      return;
    }
    if ( _e == _chart4_autoUpdateEvent_xjal ) {
      chart4.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Вложенные объекты

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _склады_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _грузовики_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _заказы_animationSettings_xjal = new AgentAnimationSettings(1000L, 10000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _терминал_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _машины_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  public Терминал терминал;

  public String getNameOf( Agent ao ) {
    if ( ao == терминал ) return "терминал";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    if ( ao == терминал ) return _терминал_animationSettings_xjal;
    return super.getAnimationSettingsOf( ao );
  }

  public class _склады_Population extends AgentArrayList<Склад> {
    _склады_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Склад instantiateAgent( int index ) {
    	return instantiate_склады_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Склад agent, int index, TableInput tableInput ) {
      setupParameters_склады_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Склад agent, int index, TableInput tableInput ) {
      doBeforeCreate_склады_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Склад")
  public _склады_Population склады = new _склады_Population( this );
  public class _грузовики_Population extends AgentArrayList<Грузовик> {
    _грузовики_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Грузовик instantiateAgent( int index ) {
    	return instantiate_грузовики_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Грузовик agent, int index, TableInput tableInput ) {
      setupParameters_грузовики_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Грузовик agent, int index, TableInput tableInput ) {
      doBeforeCreate_грузовики_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Грузовик")
  public _грузовики_Population грузовики = new _грузовики_Population( this );
  public class _заказы_Population extends AgentArrayList<Заказ> {
    _заказы_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Заказ instantiateAgent( int index ) {
    	return instantiate_заказы_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Заказ agent, int index, TableInput tableInput ) {
      setupParameters_заказы_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Заказ agent, int index, TableInput tableInput ) {
      doBeforeCreate_заказы_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Заказ")
  public _заказы_Population заказы = new _заказы_Population( this );
  public class _машины_Population extends AgentArrayList<Машина> {
    _машины_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Машина instantiateAgent( int index ) {
    	return instantiate_машины_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Машина agent, int index, TableInput tableInput ) {
      setupParameters_машины_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Машина agent, int index, TableInput tableInput ) {
      doBeforeCreate_машины_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Машина")
  public _машины_Population машины = new _машины_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == склады ) return "склады";
    if( aolist == грузовики ) return "грузовики";
    if( aolist == заказы ) return "заказы";
    if( aolist == машины ) return "машины";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == склады ) return _склады_animationSettings_xjal;
    if( aolist == грузовики ) return _грузовики_animationSettings_xjal;
    if( aolist == заказы ) return _заказы_animationSettings_xjal;
    if( aolist == машины ) return _машины_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in склады
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Склад склады(int index) {
    return склады.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов склады<br>
   * @return только что созданный вложенный объект
   */
  public Склад add_склады() {
    int index = склады.size();
    Склад _result_xjal = instantiate_склады_xjal( index );
    склады.callSetupParameters( _result_xjal, index );
    склады.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов склады<br>
   * Этот метод использует заданные значения параметров для инициализации созданного вложенного объекта<br>
   * Индекс нового экземпляра реплицированного объекта может быть получен с помощью метода <code>склады.size()</code>  <strong>перед</strong> вызовом этого метода
   * @param склад
   * @param адрес
   * @param таймаут
   * @return только что созданный вложенный объект
   */
  public Склад add_склады( String склад, String адрес, double таймаут ) {
    int index = склады.size();
    Склад _result_xjal = instantiate_склады_xjal( index );
    // Задание значений параметров
    _result_xjal.markParametersAreSet();
    _result_xjal.склад = склад;
    _result_xjal.адрес = адрес;
    _result_xjal.таймаут = таймаут;
    // Завершение создания вложенного объекта
    склады.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта склады<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта склады, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит склады
   */
  public boolean remove_склады( Склад object ) {
    if( ! склады._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in грузовики
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Грузовик грузовики(int index) {
    return грузовики.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов грузовики<br>
   * @return только что созданный вложенный объект
   */
  public Грузовик add_грузовики() {
    int index = грузовики.size();
    Грузовик _result_xjal = instantiate_грузовики_xjal( index );
    грузовики.callSetupParameters( _result_xjal, index );
    грузовики.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов грузовики<br>
   * Этот метод использует заданные значения параметров для инициализации созданного вложенного объекта<br>
   * Индекс нового экземпляра реплицированного объекта может быть получен с помощью метода <code>грузовики.size()</code>  <strong>перед</strong> вызовом этого метода
   * @param наименование
   * @param скорость
   * @param количество
   * @param вместимость
   * @return только что созданный вложенный объект
   */
  public Грузовик add_грузовики( String наименование, int скорость, int количество, double вместимость ) {
    int index = грузовики.size();
    Грузовик _result_xjal = instantiate_грузовики_xjal( index );
    // Задание значений параметров
    _result_xjal.markParametersAreSet();
    _result_xjal.наименование = наименование;
    _result_xjal.скорость = скорость;
    _result_xjal.количество = количество;
    _result_xjal.вместимость = вместимость;
    // Завершение создания вложенного объекта
    грузовики.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта грузовики<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта грузовики, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит грузовики
   */
  public boolean remove_грузовики( Грузовик object ) {
    if( ! грузовики._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in заказы
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Заказ заказы(int index) {
    return заказы.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов заказы<br>
   * @return только что созданный вложенный объект
   */
  public Заказ add_заказы() {
    int index = заказы.size();
    Заказ _result_xjal = instantiate_заказы_xjal( index );
    заказы.callSetupParameters( _result_xjal, index );
    заказы.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов заказы<br>
   * Этот метод использует заданные значения параметров для инициализации созданного вложенного объекта<br>
   * Индекс нового экземпляра реплицированного объекта может быть получен с помощью метода <code>заказы.size()</code>  <strong>перед</strong> вызовом этого метода
   * @param заказчик
   * @param объём
   * @param назначение
   * @return только что созданный вложенный объект
   */
  public Заказ add_заказы( Склад заказчик, double объём, Склад назначение ) {
    int index = заказы.size();
    Заказ _result_xjal = instantiate_заказы_xjal( index );
    // Задание значений параметров
    _result_xjal.markParametersAreSet();
    _result_xjal.заказчик = заказчик;
    _result_xjal.объём = объём;
    _result_xjal.назначение = назначение;
    // Завершение создания вложенного объекта
    заказы.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта заказы<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта заказы, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит заказы
   */
  public boolean remove_заказы( Заказ object ) {
    if( ! заказы._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in машины
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Машина машины(int index) {
    return машины.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов машины<br>
   * @return только что созданный вложенный объект
   */
  public Машина add_машины() {
    int index = машины.size();
    Машина _result_xjal = instantiate_машины_xjal( index );
    машины.callSetupParameters( _result_xjal, index );
    машины.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов машины<br>
   * Этот метод использует заданные значения параметров для инициализации созданного вложенного объекта<br>
   * Индекс нового экземпляра реплицированного объекта может быть получен с помощью метода <code>машины.size()</code>  <strong>перед</strong> вызовом этого метода
   * @param наименование
   * @param скорость
   * @param количество
   * @param вместимость
   * @return только что созданный вложенный объект
   */
  public Машина add_машины( String наименование, int скорость, int количество, int вместимость ) {
    int index = машины.size();
    Машина _result_xjal = instantiate_машины_xjal( index );
    // Задание значений параметров
    _result_xjal.markParametersAreSet();
    _result_xjal.наименование = наименование;
    _result_xjal.скорость = скорость;
    _result_xjal.количество = количество;
    _result_xjal.вместимость = вместимость;
    // Завершение создания вложенного объекта
    машины.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта машины<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта машины, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит машины
   */
  public boolean remove_машины( Машина object ) {
    if( ! машины._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected Склад instantiate_склады_xjal( final int index ) {
    Склад _result_xjal = new Склад( getEngine(), this, склады );
    
    склады._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_склады_xjal( final Склад self, final int index, TableInput _t ) {
    if (_t != null) {
      self.склад = _t.getValue( "склад", String.class );
    } else {
    self.склад = self._склад_DefaultValue_xjal();
    }
    if (_t != null) {
      self.адрес = _t.getValue( "адрес", String.class );
    } else {
    self.адрес = self._адрес_DefaultValue_xjal();
    }
    self.таймаут = self._таймаут_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_склады_xjal( Склад self, final int index, TableInput _t ) {
    self.setEnvironment( this );
    if (_t != null) {
      self.setLocationRandomInside( getGISMap().searchFirst(_t.getValue( "адрес", String.class )) );
    } else {
    self.setLatLon( 55.30716704145204, 40.66128472872923 );
    }

    // Port connections
  }
  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected Грузовик instantiate_грузовики_xjal( final int index ) {
    Грузовик _result_xjal = new Грузовик( getEngine(), this, грузовики );
    
    грузовики._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_грузовики_xjal( final Грузовик self, final int index, TableInput _t ) {
    if (_t != null) {
      self.наименование = _t.getValue( "наименование", String.class );
    } else {
    self.наименование = self._наименование_DefaultValue_xjal();
    }
    if (_t != null) {
      self.скорость = _t.getValue( "скорость", int.class );
    } else {
    self.скорость = 
selectUniqueValue(int.class,
	"SELECT скорость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
    }
    if (_t != null) {
      self.количество = _t.getValue( "количество", int.class );
    } else {
    self.количество = 
selectUniqueValue(int.class,
	"SELECT количество FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
    }
    if (_t != null) {
      self.вместимость = _t.getValue( "вместимость", double.class );
    } else {
    self.вместимость = 
selectUniqueValue(double.class,
	"SELECT вместимость FROM транспорт WHERE " + 
		"наименование = ? LIMIT 2;",
		"Грузовик"
) 
;
    }
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_грузовики_xjal( Грузовик self, final int index, TableInput _t ) {
    self.setEnvironment( this );
	String _value = 
"Москва, Ленинская Слобода" 
;
	self.setLocationRandomInside( getGISMap().searchFirst( _value ) );

    // Port connections
  }
  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected Заказ instantiate_заказы_xjal( final int index ) {
    Заказ _result_xjal = new Заказ( getEngine(), this, заказы );
    
    заказы._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_заказы_xjal( final Заказ self, final int index, TableInput _t ) {
    self.заказчик = self._заказчик_DefaultValue_xjal();
    self.объём = self._объём_DefaultValue_xjal();
    self.назначение = self._назначение_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_заказы_xjal( Заказ self, final int index, TableInput _t ) {
    self.setEnvironment( this );
    self.setLatLon( 54.91457654947474, 42.30856214459641 );

    // Port connections
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected Терминал instantiate_терминал_xjal() {
    Терминал _result_xjal = new Терминал( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_терминал_xjal( final Терминал self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_терминал_xjal( Терминал self, TableInput _t ) {
    self.setEnvironment( this );
    if (_t != null) {
      self.setLocationRandomInside( getGISMap().searchFirst(_t.getValue( "адрес", String.class )) );
    } else {
	String _value = 
"Москва, Ленинская Слобода" 
;
	self.setLocationRandomInside( getGISMap().searchFirst( _value ) );
    }
  }
  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected Машина instantiate_машины_xjal( final int index ) {
    Машина _result_xjal = new Машина( getEngine(), this, машины );
    
    машины._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_машины_xjal( final Машина self, final int index, TableInput _t ) {
    if (_t != null) {
      self.наименование = _t.getValue( "наименование", String.class );
    } else {
    self.наименование = self._наименование_DefaultValue_xjal();
    }
    if (_t != null) {
      self.скорость = _t.getValue( "скорость", int.class );
    } else {
    self.скорость = self._скорость_DefaultValue_xjal();
    }
    if (_t != null) {
      self.количество = _t.getValue( "количество", int.class );
    } else {
    self.количество = self._количество_DefaultValue_xjal();
    }
    if (_t != null) {
      self.вместимость = _t.getValue( "вместимость", int.class );
    } else {
    self.вместимость = self._вместимость_DefaultValue_xjal();
    }
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_машины_xjal( Машина self, final int index, TableInput _t ) {
    self.setEnvironment( this );
	String _value = 
"Москва, Ленинская Слобода" 
;
	self.setLocationRandomInside( getGISMap().searchFirst( _value ) );

    // Port connections
  }

  // Объекты статистики
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
(int)(терминал.грузовики.utilization()*100) 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
(int)(терминал.машины.utilization()*100) 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot1_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot1_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot1_expression0_dataSet_xjal_YValue() {
    return 
заказы.size() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot2_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot2_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot2_expression0_dataSet_xjal_YValue() {
    return 
терминал.takeVehicle.size() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot2_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot2_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot2_expression1_dataSet_xjal_YValue() {
    return 
терминал.takeVehicle1.size() 
;
  }

  public HistogramSmartData data = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( HistogramData _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( _data_Value() );
      _lastUpdateX = time();
    }
  } );
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _data_Value() {
    return 
терминал.takeVehicle.size() 
;
  }
  
  public HistogramSmartData data1 = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( HistogramData _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( _data1_Value() );
      _lastUpdateX = time();
    }
  } );
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _data1_Value() {
    return 
терминал.takeVehicle1.size() 
;
  }
  
  // Области
  public ViewArea viewArea = new ViewArea( this, null, 0, 0, 1200, 550 );
  public ViewArea viewArea1 = new ViewArea( this, null, 0, -970, 1200, 550 );
  public ViewArea _origin_VA = new ViewArea( this, "[Нач. координат]", 0, 0, 1440.0, 900.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "viewArea", this.viewArea );
      _output.put( "viewArea1", this.viewArea1 );
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 3 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _button_Font = new Font("Dialog", 0, 12 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox_Font = new Font("Dialog", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox1_Font = _editbox_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox2_Font = _editbox_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 16 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = new Font("SansSerif", 0, 20 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _N_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _N1_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _N2_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _N3_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = new Font("SansSerif", 0, 22 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text14_Font = _text13_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text15_Font = _text13_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text16_Font = _text13_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = _text13_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text18_Font = _text6_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text19_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text20_Font = new Font("SansSerif", 0, 18 );
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox1 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox2 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart1 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart2 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart3 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot1 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _plot2 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart4 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart5 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _map = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _склады_presentation = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _грузовики_presentation = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _терминал_presentation = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _машины_presentation = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _заказы_presentation = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle1 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle2 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _N = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 31;
  @AnyLogicInternalCodegenAPI
  protected static final int _N1 = 32;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 33;
  @AnyLogicInternalCodegenAPI
  protected static final int _N2 = 34;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 35;
  @AnyLogicInternalCodegenAPI
  protected static final int _N3 = 36;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 37;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle3 = 38;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 39;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle4 = 40;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 41;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle5 = 42;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 43;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle6 = 44;
  @AnyLogicInternalCodegenAPI
  protected static final int _text14 = 45;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle7 = 46;
  @AnyLogicInternalCodegenAPI
  protected static final int _text15 = 47;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle8 = 48;
  @AnyLogicInternalCodegenAPI
  protected static final int _text16 = 49;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle9 = 50;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 51;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle10 = 52;
  @AnyLogicInternalCodegenAPI
  protected static final int _text18 = 53;
  @AnyLogicInternalCodegenAPI
  protected static final int _groupMenu = 54;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle11 = 55;
  @AnyLogicInternalCodegenAPI
  protected static final int _text19 = 56;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle12 = 57;
  @AnyLogicInternalCodegenAPI
  protected static final int _text20 = 58;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 59;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    if (_a == терминал) { return true; }
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(map, склады_presentation, грузовики_presentation, терминал_presentation, машины_presentation, заказы_presentation, text, text1, text2, rectangle, rectangle1, rectangle2, text3, text4, text5, text6, N, text7, N1, text8, N2, text9, N3, text10, groupMenu, rectangle11, text19, rectangle12, text20, button, editbox, editbox1, editbox2, chart, chart1, chart2, chart3, plot, plot1, plot2, chart4, chart5);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _rectangle:
        if (true) {
          ShapeRectangle self = this.rectangle;
          
склады.get(0).viewArea.navigateTo(); 
        }
        break;
      case _rectangle1:
        if (true) {
          ShapeRectangle self = this.rectangle1;
          
склады.get(1).viewArea.navigateTo(); 
        }
        break;
      case _rectangle2:
        if (true) {
          ShapeRectangle self = this.rectangle2;
          
склады.get(2).viewArea.navigateTo(); 
        }
        break;
      case _rectangle3:
        if (true) {
          ShapeRectangle self = this.rectangle3;
          
viewArea.navigateTo(); 
        }
        break;
      case _rectangle4:
        if (true) {
          ShapeRectangle self = this.rectangle4;
          
viewArea1.navigateTo(); 
        }
        break;
      case _rectangle10:
        if (true) {
          ShapeRectangle self = this.rectangle10;
          
viewArea1.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index ) {
    switch( _shape ) {
      case _button: {
          ShapeButton self = this.button;
Заказ заказ = add_заказы(склады.get(кодСкладЗаказ), объёмЗаказ, склады.get(кодСкладНазначение));
send( заказ, терминал); 

 
;}
        break;
      default:
        super.executeShapeControlAction( _shape, index );
        break;
    }
  }


  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index, String value ) {
    switch( _shape ) {
      case _editbox:
        объёмЗаказ = Double.parseDouble(value);
        break;
      case _editbox1:
        кодСкладЗаказ = Integer.parseInt(value);
        break;
      case _editbox2:
        кодСкладНазначение = Integer.parseInt(value);
        break;
      default:
        super.executeShapeControlAction( _shape, index, value );
        break;
    }
  }
        
  @Override
  @AnyLogicInternalCodegenAPI
  public String getShapeControlDefaultValueString( int _shape, int index ) {
    switch(_shape) {
      case _editbox: return String.valueOf(
объёмЗаказ 
);
      case _editbox1: return String.valueOf(
кодСкладЗаказ 
);
      case _editbox2: return String.valueOf(
кодСкладНазначение 
);
      default: return super.getShapeControlDefaultValueString( _shape, index );
    }
  }

  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _chart_DataItem0Value() {
    return 
(int)(терминал.грузовики.utilization()*100) 
;
  }
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _chart1_DataItem0Value() {
    return 
терминал.takeVehicle.size() 
;
  }
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _chart1_DataItem1Value() {
    return 
терминал.takeVehicle1.size() 
;
  }
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _chart3_DataItem0Value() {
    return 
(int)(терминал.машины.utilization()*100) 
;
  }
  protected ShapeButton button;
  protected ShapeTextField editbox;
  protected ShapeTextField editbox1;
  protected ShapeTextField editbox2;
  protected BarChart chart;
  protected BarChart chart1;
  protected Histogram chart2;
  protected BarChart chart3;
  protected TimePlot plot;
  protected TimePlot plot1;
  protected TimePlot plot2;
  protected Histogram chart4;
  protected Histogram chart5;
  protected ShapeGISMap map;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _склады_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 55.30716704145204, 40.66128472872923, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup склады_presentation;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _грузовики_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 55.30716704145204, 40.66128472872923, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup грузовики_presentation;
  protected ShapeEmbeddedObjectPresentation терминал_presentation;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _машины_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 48.87825489555433, 43.48911095930108, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup машины_presentation;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _заказы_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 54.91457654947474, 42.30856214459641, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup заказы_presentation;
  protected ShapeText text;
  protected ShapeText text1;
  protected ShapeText text2;
  protected ShapeRectangle rectangle;
  protected ShapeRectangle rectangle1;
  protected ShapeRectangle rectangle2;
  protected ShapeText text3;
  protected ShapeText text4;
  protected ShapeText text5;
  protected ShapeText text6;
  protected ShapeText N;
  protected ShapeText text7;
  protected ShapeText N1;
  protected ShapeText text8;
  protected ShapeText N2;
  protected ShapeText text9;
  protected ShapeText N3;
  protected ShapeText text10;
  protected ShapeRectangle rectangle3;
  protected ShapeText text11;
  protected ShapeRectangle rectangle4;
  protected ShapeText text12;
  protected ShapeRectangle rectangle5;
  protected ShapeText text13;
  protected ShapeRectangle rectangle6;
  protected ShapeText text14;
  protected ShapeRectangle rectangle7;
  protected ShapeText text15;
  protected ShapeRectangle rectangle8;
  protected ShapeText text16;
  protected ShapeRectangle rectangle9;
  protected ShapeText text17;
  protected ShapeRectangle rectangle10;
  protected ShapeText text18;
  protected ShapeGroup groupMenu;
  protected ShapeRectangle rectangle11;
  protected ShapeText text19;
  protected ShapeRectangle rectangle12;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text20_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
new SimpleDateFormat("MMM d, yyyy   HH:mm", Locale.ENGLISH).format(date()) 
);
  }
  
  protected ShapeText text20;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    button = new ShapeButton(
			Main.this, false, 750.0, 650.0, 
			150.0, 30.0,
            controlDefault, true,
            _button_Font, 
			"Добавить Перевозку" ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _button, 0 );
      }
    };

    editbox = new ShapeTextField(
			Main.this, true,610.0, 650.0, 
			100.0, 30.0,
            controlDefault, controlDefault, true, _editbox_Font,
            ShapeControl.TYPE_DOUBLE, -infinity
            , infinity
			 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _editbox, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setText( getShapeControlDefaultValueString( _editbox, 0 ) );
      }
    };

    editbox1 = new ShapeTextField(
			Main.this, true,610.0, 700.0, 
			100.0, 30.0,
            controlDefault, controlDefault, true, _editbox1_Font,
            ShapeControl.TYPE_INT, -infinity
            , infinity
			 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _editbox1, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setText( getShapeControlDefaultValueString( _editbox1, 0 ) );
      }
    };

    editbox2 = new ShapeTextField(
			Main.this, true,610.0, 750.0, 
			100.0, 30.0,
            controlDefault, controlDefault, true, _editbox2_Font,
            ShapeControl.TYPE_INT, -infinity
            , infinity
			 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _editbox2, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setText( getShapeControlDefaultValueString( _editbox2, 0 ) );
      }
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,500.0, 660.0, 0.0, 0.0, 
        black,"Масса",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D, true,500.0, 710.0, 0.0, 0.0, 
        black,"Склад Заказа",
        _text1_Font, ALIGNMENT_LEFT );

    text2 = new ShapeText(
        SHAPE_DRAW_2D, true,500.0, 750.0, 0.0, 0.0, 
        black,"Склад \r\nНазначение",
        _text2_Font, ALIGNMENT_LEFT );

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,50.0, 950.0, 0.0, 0.0, 
            black, white,
			80.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle, 0, clickx, clicky );
      }
    };

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,150.0, 950.0, 0.0, 0.0, 
            black, white,
			80.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle1, 0, clickx, clicky );
      }
    };

    rectangle2 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,250.0, 950.0, 0.0, 0.0, 
            black, white,
			80.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle2, 0, clickx, clicky );
      }
    };

    text3 = new ShapeText(
        SHAPE_DRAW_2D, true,60.0, 970.0, 0.0, 0.0, 
        black,"Москва",
        _text3_Font, ALIGNMENT_LEFT );

    text4 = new ShapeText(
        SHAPE_DRAW_2D, true,150.0, 970.0, 0.0, 0.0, 
        black,"Хотьково",
        _text4_Font, ALIGNMENT_LEFT );

    text5 = new ShapeText(
        SHAPE_DRAW_2D, true,270.0, 970.0, 0.0, 0.0, 
        black,"Сочи",
        _text5_Font, ALIGNMENT_LEFT );

    text6 = new ShapeText(
        SHAPE_DRAW_2D, true,400.0, 880.0, 0.0, 0.0, 
        black,"Заказ:",
        _text6_Font, ALIGNMENT_LEFT );

    N = new ShapeText(
        SHAPE_DRAW_2D, true,400.0, 930.0, 0.0, 0.0, 
        black,"",
        _N_Font, ALIGNMENT_LEFT );

    text7 = new ShapeText(
        SHAPE_DRAW_2D, true,500.0, 880.0, 0.0, 0.0, 
        black,"Заказчик",
        _text7_Font, ALIGNMENT_LEFT );

    N1 = new ShapeText(
        SHAPE_DRAW_2D, true,500.0, 930.0, 0.0, 0.0, 
        black,"",
        _N1_Font, ALIGNMENT_LEFT );

    text8 = new ShapeText(
        SHAPE_DRAW_2D, true,600.0, 880.0, 0.0, 0.0, 
        black,"Назначение",
        _text8_Font, ALIGNMENT_LEFT );

    N2 = new ShapeText(
        SHAPE_DRAW_2D, true,600.0, 930.0, 0.0, 0.0, 
        black,"",
        _N2_Font, ALIGNMENT_LEFT );

    text9 = new ShapeText(
        SHAPE_DRAW_2D, true,750.0, 880.0, 0.0, 0.0, 
        black,"Объём",
        _text9_Font, ALIGNMENT_LEFT );

    N3 = new ShapeText(
        SHAPE_DRAW_2D, true,750.0, 930.0, 0.0, 0.0, 
        black,"",
        _N3_Font, ALIGNMENT_LEFT );

    text10 = new ShapeText(
        SHAPE_DRAW_2D, true,-230.0, 40.0, 0.0, 0.0, 
        black,"Московский 0\r\nЖелезнодорожный 1\r\nКрасногорский 2\r\nСосенский 3\r\nКовровский 4\r\nТулиновский 5",
        _text10_Font, ALIGNMENT_LEFT );

    rectangle3 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, 90.0, 0.0, 0.0, 
            black, white,
			160.0, 60.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle3, 0, clickx, clicky );
      }
    };

    text11 = new ShapeText(
        SHAPE_DRAW_2D, true,-120.0, 110.0, 0.0, 0.0, 
        black,"Анимация",
        _text11_Font, ALIGNMENT_LEFT );

    rectangle4 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 90.0, 0.0, 0.0, 
            black, white,
			160.0, 60.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle4, 0, clickx, clicky );
      }
    };

    text12 = new ShapeText(
        SHAPE_DRAW_2D, true,30.0, 110.0, 0.0, 0.0, 
        black,"Статистика",
        _text12_Font, ALIGNMENT_LEFT );

    rectangle5 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, -160.0, 0.0, 0.0, 
            black, white,
			50.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text13 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, -150.0, 0.0, 0.0, 
        black,"1",
        _text13_Font, ALIGNMENT_LEFT );

    rectangle6 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, -110.0, 0.0, 0.0, 
            black, white,
			50.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text14 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, -100.0, 0.0, 0.0, 
        black,"2",
        _text14_Font, ALIGNMENT_LEFT );

    rectangle7 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, -60.0, 0.0, 0.0, 
            black, white,
			50.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text15 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, -50.0, 0.0, 0.0, 
        black,"3",
        _text15_Font, ALIGNMENT_LEFT );

    rectangle8 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, -10.0, 0.0, 0.0, 
            black, white,
			50.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text16 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, 0.0, 0.0, 0.0, 
        black,"4",
        _text16_Font, ALIGNMENT_LEFT );

    rectangle9 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-160.0, 40.0, 0.0, 0.0, 
            black, white,
			50.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text17 = new ShapeText(
        SHAPE_DRAW_2D, true,-140.0, 52.0, 0.0, 0.0, 
        black,"5",
        _text17_Font, ALIGNMENT_LEFT );

    rectangle10 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,160.0, 90.0, 0.0, 0.0, 
            black, white,
			160.0, 60.0, 10.0, 1.0, LINE_STYLE_SOLID ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle10, 0, clickx, clicky );
      }
    };

    text18 = new ShapeText(
        SHAPE_DRAW_2D, true,210.0, 110.0, 0.0, 0.0, 
        black,"Заказ",
        _text18_Font, ALIGNMENT_LEFT );

    rectangle11 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 130.0, 0.0, 0.0, 
            black, white,
			50.0, 110.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text19 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 131.0, 0.0, 0.0, 
        black,"С\r\nк\r\nл\r\nа\r\nд",
        _text19_Font, ALIGNMENT_LEFT );

    rectangle12 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 0.0, 0.0, 0.0, 
            black, white,
			310.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text20 = new ShapeText(
        SHAPE_DRAW_2D, true,60.0, 15.0, 0.0, 0.0, 
        black,"text",
        _text20_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text20_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    List<DataItem> _items = new ArrayList<DataItem>( 1 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _chart_DataItem0Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Загрузка грузовиков" );
    List<Color> _colors = new ArrayList<Color>( 1 );
    _colors.add( mediumSeaGreen );
    chart = new BarChart(
		    Main.this, true, 1470.0, 220.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.NORTH, Chart.SCALE_AUTO,
            0, 0, 0.48,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );

    }
    {
    List<DataItem> _items = new ArrayList<DataItem>( 2 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _chart1_DataItem0Value() );
      }
    });
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _chart1_DataItem1Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Заказов в очереди на грузовики" );
    _titles.add( "Заказов в очереди на машины" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( slateGray );
    _colors.add( darkMagenta );
    chart1 = new BarChart(
		    Main.this, true, 1460.0, 0.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 110.0, white, black, black,
            40.0, Chart.SOUTH,
            Chart.NORTH, Chart.SCALE_FIXED,
            
0 
            , 
10 
            , 0.27,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
терминал.timeTotal.distribution
 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Время обслуживания заказа" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( deepSkyBlue, oliveDrab, deepPink, mediumTurquoise, 1, oliveDrab ) );
    chart2 = new Histogram(
		    Main.this, true, 140.0, -980.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, true, true, 0.66,
            _items, _titles, _appearances );

    }
    {
    List<DataItem> _items = new ArrayList<DataItem>( 1 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _chart3_DataItem0Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Загрузка машин" );
    List<Color> _colors = new ArrayList<Color>( 1 );
    _colors.add( mediumSeaGreen );
    chart3 = new BarChart(
		    Main.this, true, 1760.0, 200.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.NORTH, Chart.SCALE_AUTO,
            0, 0, 0.48,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    _items.add( _plot_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Загрузка грузовиков" );
    _titles.add( "Загрузка машин" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( brown, true, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( green, true, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_SQUARE ) );
    plot = new TimePlot(
		    Main.this, true, 0.0, -320.0, 
			1200.0, 210.0,
            null, null,
            50.0, 30.0,
			1120.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances );

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 1 );
    _items.add( _plot1_expression0_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Количество заказов" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 1 );
    _appearances.add( new Chart2DPlot.Appearance( dodgerBlue, true, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_SQUARE ) );
    plot1 = new TimePlot(
		    Main.this, true, 0.0, -530.0, 
			1200.0, 210.0,
            null, null,
            50.0, 30.0,
			1120.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances );

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _plot2_expression0_dataSet_xjal ); 
    _items.add( _plot2_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Заказов в очереди на грузовики" );
    _titles.add( "Заказов в очереди на машины" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( brown, true, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( green, true, true, Chart.INTERPOLATION_LINEAR, 2.0, Chart.POINT_SQUARE ) );
    plot2 = new TimePlot(
		    Main.this, true, 0.0, -740.0, 
			1220.0, 210.0,
            null, null,
            50.0, 30.0,
			1140.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances );

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
data 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Заказов в очереди на Грузовик" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( deepSkyBlue, mediumTurquoise, orange, goldenRod, 1, chocolate ) );
    chart4 = new Histogram(
		    Main.this, true, 460.0, -980.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, true, false, 0.8,
            _items, _titles, _appearances );

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
data1 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Заказов в очереди на Машину" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( darkKhaki, chocolate, darkKhaki, mediumSeaGreen, 1, darkKhaki ) );
    chart5 = new Histogram(
		    Main.this, true, 760.0, -980.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, false, 0.8,
            _items, _titles, _appearances );

    }
    склады_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, склады) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _склады_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    грузовики_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, грузовики) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _грузовики_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    {
    терминал_presentation = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 55.294663846062804, 40.639321029851, 0.0, 0.0,
		false, true, null );

    }
    машины_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, машины) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _машины_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    заказы_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, заказы) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _заказы_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    {				
    groupMenu = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 160.0, 400.0, 0.0, 0.0
	
	     , rectangle3
	     , text11
	     , rectangle4
	     , text12
	     , rectangle5
	     , text13
	     , rectangle6
	     , text14
	     , rectangle7
	     , text15
	     , rectangle8
	     , text16
	     , rectangle9
	     , text17
	     , rectangle10
	     , text18 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
    терминал_presentation.setEmbeddedObject_xjal( терминал );
    терминал_presentation.setEmbeddedObject_xjal( терминал );
  }


  // Статическая инициализация элементов, у которых разрешено программное управление
  private void instantiatePersistentElements_xjal() {
    map = new ShapeGISMap(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0,
			1200.0, 550.0, "/пробавперёд/", new ShapeGISMap.Layer[] { }, 50.03167744631601, 38.71932768624601, 5.0E-8, silver, 
		white, true, 
		TileURLProviderType.ANYLOGIC, 
		new AnyLogicOnlineRouteProvider(RoutingMethod.FASTEST, RouteProviderTransportType.CAR), 
		10, false );

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
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
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
    терминал = instantiate_терминал_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( int колвоГрузовиков, int колвоМашин, double вместимость_грузовик, double вместимость_машина, int скоростьГрузовиков, int скоростьМашин ) {
    markParametersAreSet();
    this.колвоГрузовиков = колвоГрузовиков;
    this.колвоМашин = колвоМашин;
    this.вместимость_грузовик = вместимость_грузовик;
    this.вместимость_машина = вместимость_машина;
    this.скоростьГрузовиков = скоростьГрузовиков;
    this.скоростьМашин = скоростьМашин;
  }
  
  /**
   * Создание экземпляров вложенных объектов
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Main_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "пробавперёд.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Инициализация агентных сред
    setupSpace( map );
    disableSteps();
    setNetworkUserDefined();
    // Создание нереплицированных вложенных объектов
    setupParameters_терминал_xjal( терминал, null );
    doBeforeCreate_терминал_xjal( терминал, null );
    терминал.createAsEmbedded();
	 // Соединители с нереплицированными объектами
    // Создание реплицированных вложенных объектов
    склады.setEnvironment( this );
    склады.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM склады;"
)), null, true, false );
    грузовики.setEnvironment( this );
    грузовики.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM транспорт;"
)), null, true, false );
    заказы.setEnvironment( this );
    for ( int i = 0; i < заказы.size(); i++ ) {
      Заказ _a = заказы.get(i); 
      setupParameters_заказы_xjal( _a, i, null );
      doBeforeCreate_заказы_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    машины.setEnvironment( this );
    машины.fillFromTable( new TableInput( this, (java.util.function.Supplier<ResultSet> & Serializable) () -> selectResultSet(
	"SELECT * FROM транспорт;"
)), null, true, false );
    setupInitialConditions_xjal( Main.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
    editbox.setValueToDefault();
    editbox1.setValueToDefault();
    editbox2.setValueToDefault();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _data_autoUpdateEvent_xjal.start();
    _data1_autoUpdateEvent_xjal.start();
    _chart_autoUpdateEvent_xjal.start();
    _chart1_autoUpdateEvent_xjal.start();
    _chart3_autoUpdateEvent_xjal.start();
    _plot_autoUpdateEvent_xjal.start();
    _plot1_autoUpdateEvent_xjal.start();
    _plot2_autoUpdateEvent_xjal.start();
    _chart4_autoUpdateEvent_xjal.start();
    for (Agent embeddedObject : склады) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : грузовики) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : заказы) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : машины) {
      embeddedObject.startAsEmbedded();
    }
    терминал.startAsEmbedded();
  }
 

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
    объёмЗаказ = 
1 
;
  }

  // API пользователя -----------------------------------------------------
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

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( склады );
    list.add( грузовики );
    list.add( заказы );
    list.add( терминал );
    list.add( машины );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _data_autoUpdateEvent_xjal ) return false;
    if ( _e == _data1_autoUpdateEvent_xjal ) return false;
    if ( _e == _chart_autoUpdateEvent_xjal ) return false;
    if ( _e == _chart1_autoUpdateEvent_xjal ) return false;
    if ( _e == _chart3_autoUpdateEvent_xjal ) return false;
    if ( _e == _plot_autoUpdateEvent_xjal ) return false;
    if ( _e == _plot1_autoUpdateEvent_xjal ) return false;
    if ( _e == _plot2_autoUpdateEvent_xjal ) return false;
    if ( _e == _chart4_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _data_autoUpdateEvent_xjal.onDestroy();
    _data1_autoUpdateEvent_xjal.onDestroy();
    _chart_autoUpdateEvent_xjal.onDestroy();
    _chart1_autoUpdateEvent_xjal.onDestroy();
    _chart3_autoUpdateEvent_xjal.onDestroy();
    _plot_autoUpdateEvent_xjal.onDestroy();
    _plot1_autoUpdateEvent_xjal.onDestroy();
    _plot2_autoUpdateEvent_xjal.onDestroy();
    _chart4_autoUpdateEvent_xjal.onDestroy();
    for (Agent _item : склады) {
      _item.onDestroy();
    }
    for (Agent _item : грузовики) {
      _item.onDestroy();
    }
    for (Agent _item : заказы) {
      _item.onDestroy();
    }
    терминал.onDestroy();
    for (Agent _item : машины) {
      _item.onDestroy();
    }
    map.destroy();
  // Объекты статистики
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    _plot1_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot2_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot2_expression1_dataSet_xjal.destroyUpdater_xjal();
    data.destroyUpdater_xjal();
    data1.destroyUpdater_xjal();
    logToDB( data, "data" );
    logToDB( data1, "data1" );
    logToDB( _plot_expression0_dataSet_xjal, "plot : Загрузка грузовиков" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : Загрузка машин" );
    logToDB( _plot1_expression0_dataSet_xjal, "plot1 : Количество заказов" );
    logToDB( _plot2_expression0_dataSet_xjal, "plot2 : Заказов в очереди на грузовики" );
    logToDB( _plot2_expression1_dataSet_xjal, "plot2 : Заказов в очереди на машины" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : склады) {
      _item.doFinish();
    }
    for (Agent _item : грузовики) {
      _item.doFinish();
    }
    for (Agent _item : заказы) {
      _item.doFinish();
    }
    терминал.doFinish();
    for (Agent _item : машины) {
      _item.doFinish();
    }
  }



}

