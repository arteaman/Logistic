package  Лог;

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

public class Склад extends Agent
{
  // Параметры

  public 
String  склад;

  /**
   * Возвращает значение по умолчанию параметра <code>склад</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _склад_DefaultValue_xjal() {
    final Склад self = this;
    return null;
  }

  public void set_склад( String value ) {
    if (value == this.склад) {
      return;
    }
    String _oldValue_xjal = this.склад;
    this.склад = value;
    onChange_склад_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter склад.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_склад()</code> method instead.
   */
  protected void onChange_склад() {
    onChange_склад_xjal( склад );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_склад_xjal( String oldValue ) {  
  }


  public 
String  адрес;

  /**
   * Возвращает значение по умолчанию параметра <code>адрес</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _адрес_DefaultValue_xjal() {
    final Склад self = this;
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


  public 
double  таймаут;

  /**
   * Возвращает значение по умолчанию параметра <code>таймаут</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _таймаут_DefaultValue_xjal() {
    final Склад self = this;
    return 
uniform( slider1.getValue(), slider.getValue() ) 
;
  }

  public void set_таймаут( double value ) {
    if (value == this.таймаут) {
      return;
    }
    double _oldValue_xjal = this.таймаут;
    this.таймаут = value;
    onChange_таймаут_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter таймаут.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_таймаут()</code> method instead.
   */
  protected void onChange_таймаут() {
    onChange_таймаут_xjal( таймаут );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_таймаут_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    склад = _склад_DefaultValue_xjal();
    адрес = _адрес_DefaultValue_xjal();
    таймаут = _таймаут_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "склад":
      if ( _callOnChange_xjal ) {
        set_склад( (String) _value_xjal );
      } else {
        склад = (String) _value_xjal;
      }
      return true;
    case "адрес":
      if ( _callOnChange_xjal ) {
        set_адрес( (String) _value_xjal );
      } else {
        адрес = (String) _value_xjal;
      }
      return true;
    case "таймаут":
      if ( _callOnChange_xjal ) {
        set_таймаут( ((Number) _value_xjal).doubleValue() );
      } else {
        таймаут = ((Number) _value_xjal).doubleValue();
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
    case "склад": _result_xjal = склад; break;
    case "адрес": _result_xjal = адрес; break;
    case "таймаут": _result_xjal = таймаут; break;
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
      list.add( "склад" );
      list.add( "адрес" );
      list.add( "таймаут" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Простые переменные

  public 
double 
 объёмЗаказ;
  public 
int 
 переключатель;
  public 
int 
 variable;
  public 
int 
 variable1;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Склад.class );
  
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


  // События

  public EventTimeout Запрос = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == Запрос ) return "Запрос";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == Запрос ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == Запрос ) {
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
    if( _e == Запрос) {
      _t = 
1 
;
      _t = toModelTime( _t, HOUR );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == Запрос ) {
      EventTimeout self = _e;

if (this.getIndex() == 0 ) {
	if (переключатель == 0) {
		Заказ заказ = main.add_заказы( this, объёмЗаказ, main.склады.get( цельМосковский() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 1) {
		Заказ заказ = main.add_заказы( this, uniform(1, 2000), main.склады.get( цельМосковский() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 2) {
		Заказ заказ = main.add_заказы( this, масса(), main.склады.get( цельМосковский() ) );
		send( заказ, main.терминал);
	}
}

if (this.getIndex() == 1 ) {
	if (переключатель == 0) {
		Заказ заказ = main.add_заказы( this, объёмЗаказ, main.склады.get( цельЖД() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 1) {
		Заказ заказ = main.add_заказы( this, uniform(1, 2000), main.склады.get( цельЖД() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 2) {
		Заказ заказ = main.add_заказы( this, масса(), main.склады.get( цельЖД() ) );
		send( заказ, main.терминал);
	}
}

if (this.getIndex() == 2 ) {
	if (переключатель == 0) {
		Заказ заказ = main.add_заказы( this, объёмЗаказ, main.склады.get( цельКрасногорск() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 1) {
		Заказ заказ = main.add_заказы( this, uniform(1, 2000), main.склады.get( цельКрасногорск() ) );
		send( заказ, main.терминал);
	}
	if (переключатель == 2) {
		Заказ заказ = main.add_заказы( this, масса(), main.склады.get( цельКрасногорск() ) );
		send( заказ, main.терминал);
	}
}


if (this.getIndex() == 0 ) {
	int k = заказов_с_Московского();
	variable1 = k;
	Запрос.restart(24/(k + 0.1));
	if ( k >= 5 && delay1.size() == 0) {
		for (int i = 0; i < k-1; i++) {
			add_маркерыМос();
			enter1.take(маркерыМос.get(i));
		}
	}	
}
if (this.getIndex() == 1 ) {
	int n = заказов_с_ЖД();
	variable = n;
	Запрос.restart(24/n);
	if ( n >= 5 && delay.size() == 0) {
		for (int i = 0; i < n-1; i++) {
			add_маркерыЖД();
			enter.take(маркерыЖД.get(i));
		}
	}	
}
if (this.getIndex() == 2 ) {
	Запрос.restart(24/заказов_с_Красногорска());
}
 
;
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Вложенные объекты

  public com.anylogic.libraries.processmodeling.Enter<
маркерЖД 
> enter;
  public com.anylogic.libraries.processmodeling.Delay<
маркерЖД 
> delay;
  public com.anylogic.libraries.processmodeling.Sink<
маркерЖД 
> sink;
  public com.anylogic.libraries.processmodeling.Enter<
маркерМос 
> enter1;
  public com.anylogic.libraries.processmodeling.Delay<
маркерМос 
> delay1;
  public com.anylogic.libraries.processmodeling.Sink<
маркерМос 
> sink1;

  public String getNameOf( Agent ao ) {
    if ( ao == enter ) return "enter";
    if ( ao == delay ) return "delay";
    if ( ao == sink ) return "sink";
    if ( ao == enter1 ) return "enter1";
    if ( ao == delay1 ) return "delay1";
    if ( ao == sink1 ) return "sink1";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _маркерыЖД_Population extends AgentArrayList<маркерЖД> {
    _маркерыЖД_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public маркерЖД instantiateAgent( int index ) {
    	return instantiate_маркерыЖД_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( маркерЖД agent, int index, TableInput tableInput ) {
      setupParameters_маркерыЖД_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( маркерЖД agent, int index, TableInput tableInput ) {
      doBeforeCreate_маркерыЖД_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "маркерЖД")
  public _маркерыЖД_Population маркерыЖД = new _маркерыЖД_Population( this );
  public class _маркерыМос_Population extends AgentArrayList<маркерМос> {
    _маркерыМос_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public маркерМос instantiateAgent( int index ) {
    	return instantiate_маркерыМос_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( маркерМос agent, int index, TableInput tableInput ) {
      setupParameters_маркерыМос_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( маркерМос agent, int index, TableInput tableInput ) {
      doBeforeCreate_маркерыМос_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "маркерМос")
  public _маркерыМос_Population маркерыМос = new _маркерыМос_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == маркерыЖД ) return "маркерыЖД";
    if( aolist == маркерыМос ) return "маркерыМос";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in маркерыЖД
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public маркерЖД маркерыЖД(int index) {
    return маркерыЖД.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов маркерыЖД<br>
   * @return только что созданный вложенный объект
   */
  public маркерЖД add_маркерыЖД() {
    int index = маркерыЖД.size();
    маркерЖД _result_xjal = instantiate_маркерыЖД_xjal( index );
    маркерыЖД.callSetupParameters( _result_xjal, index );
    маркерыЖД.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта маркерыЖД<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта маркерыЖД, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит маркерыЖД
   */
  public boolean remove_маркерыЖД( маркерЖД object ) {
    if( ! маркерыЖД._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in маркерыМос
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public маркерМос маркерыМос(int index) {
    return маркерыМос.get( index );
  }

  /**
   * Этот метод создает и добавляет новый вложенный объект в список экземпляров реплицированного объектов маркерыМос<br>
   * @return только что созданный вложенный объект
   */
  public маркерМос add_маркерыМос() {
    int index = маркерыМос.size();
    маркерМос _result_xjal = instantiate_маркерыМос_xjal( index );
    маркерыМос.callSetupParameters( _result_xjal, index );
    маркерыМос.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * Этот метод удаляет заданный вложенный объект из коллекции экземпляров реплицированного объекта маркерыМос<br>
   * Данный объект будет уничтожен, но в общем случае это произойдет позже.
   * @param object активный объект - элемент реплицированного вложенного объекта маркерыМос, который должен быть удален
   * @return <code>true</code>, если объект успешно удален, <code>false</code>, если он не принадлежит маркерыМос
   */
  public boolean remove_маркерыМос( маркерМос object ) {
    if( ! маркерыМос._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<маркерЖД> instantiate_enter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<маркерЖД> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<маркерЖД>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_enter_xjal( final com.anylogic.libraries.processmodeling.Enter<маркерЖД> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_enter_xjal( com.anylogic.libraries.processmodeling.Enter<маркерЖД> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<маркерЖД> instantiate_delay_xjal() {
    com.anylogic.libraries.processmodeling.Delay<маркерЖД> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<маркерЖД>( getEngine(), this, null ) {
      @Override
      public double delayTime( маркерЖД agent ) {
        return _delay_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return HOUR;
      }
      @Override
      public void onExit( маркерЖД agent ) {
        _delay_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_delay_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерЖД> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = 
20 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_delay_xjal( com.anylogic.libraries.processmodeling.Delay<маркерЖД> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<маркерЖД> instantiate_sink_xjal() {
    com.anylogic.libraries.processmodeling.Sink<маркерЖД> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<маркерЖД>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_sink_xjal( final com.anylogic.libraries.processmodeling.Sink<маркерЖД> self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink_xjal( com.anylogic.libraries.processmodeling.Sink<маркерЖД> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected маркерЖД instantiate_маркерыЖД_xjal( final int index ) {
    маркерЖД _result_xjal = new маркерЖД( getEngine(), this, маркерыЖД );
    
    маркерыЖД._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_маркерыЖД_xjal( final маркерЖД self, final int index, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_маркерыЖД_xjal( маркерЖД self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<маркерМос> instantiate_enter1_xjal() {
    com.anylogic.libraries.processmodeling.Enter<маркерМос> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<маркерМос>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_enter1_xjal( final com.anylogic.libraries.processmodeling.Enter<маркерМос> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_enter1_xjal( com.anylogic.libraries.processmodeling.Enter<маркерМос> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<маркерМос> instantiate_delay1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<маркерМос> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<маркерМос>( getEngine(), this, null ) {
      @Override
      public double delayTime( маркерМос agent ) {
        return _delay1_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return HOUR;
      }
      @Override
      public void onExit( маркерМос agent ) {
        _delay1_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_delay1_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерМос> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = 
20 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_delay1_xjal( com.anylogic.libraries.processmodeling.Delay<маркерМос> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<маркерМос> instantiate_sink1_xjal() {
    com.anylogic.libraries.processmodeling.Sink<маркерМос> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<маркерМос>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_sink1_xjal( final com.anylogic.libraries.processmodeling.Sink<маркерМос> self, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink1_xjal( com.anylogic.libraries.processmodeling.Sink<маркерМос> self, TableInput _t ) {
  }
  /**
   * Создает экземпляр вложенного объекта и добавляет его в конец списка экземпляров реплицированных объектов<br>
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  protected маркерМос instantiate_маркерыМос_xjal( final int index ) {
    маркерМос _result_xjal = new маркерМос( getEngine(), this, маркерыМос );
    
    маркерыМос._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Инициализация параметров экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  private void setupParameters_маркерыМос_xjal( final маркерМос self, final int index, TableInput _t ) {
  }

  /**
   * Инициализация экземпляра вложенного объекта<br>
   * Пользователь не должен вызывать этот метод
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_маркерыМос_xjal( маркерМос self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }

  private double _delay_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерЖД> self, маркерЖД agent ) {
    double _value;
    _value = 
(24/variable)+uniform(4, 10) 
;
    _value = HOUR.convertTo( _value, SECOND );
    return _value;
  }
  private void _delay_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерЖД> self, маркерЖД agent ) {
    
Заказ заказ = main.add_заказы( this, масса(), main.склады.get( цельЖД() ) );
send( заказ, main.терминал); 
;
  }
  private double _delay1_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерМос> self, маркерМос agent ) {
    double _value;
    _value = 
(24/variable1)+uniform(4, 10) 
;
    _value = HOUR.convertTo( _value, SECOND );
    return _value;
  }
  private void _delay1_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<маркерМос> self, маркерМос agent ) {
    
Заказ заказ = main.add_заказы( this, масса(), main.склады.get( цельЖД() ) );
send( заказ, main.терминал); 
;
  }
  // Эмпирические рапределения

  /**
   * заказов_с_Красногорска Эмпирическое рапределение
   */
  public CustomDistribution заказов_с_Красногорска;

  public int заказов_с_Красногорска() { return заказов_с_Красногорска.getInt(); }


  /**
   * цельКрасногорск Эмпирическое рапределение
   */
  public CustomDistribution цельКрасногорск;

  public int цельКрасногорск() { return цельКрасногорск.getInt(); }


  /**
   * заказов_с_Московского Эмпирическое рапределение
   */
  public CustomDistribution заказов_с_Московского;

  public int заказов_с_Московского() { return заказов_с_Московского.getInt(); }


  /**
   * заказов_с_ЖД Эмпирическое рапределение
   */
  public CustomDistribution заказов_с_ЖД;

  public int заказов_с_ЖД() { return заказов_с_ЖД.getInt(); }


  /**
   * цельМосковский Эмпирическое рапределение
   */
  public CustomDistribution цельМосковский;

  public int цельМосковский() { return цельМосковский.getInt(); }


  /**
   * цельЖД Эмпирическое рапределение
   */
  public CustomDistribution цельЖД;

  public int цельЖД() { return цельЖД.getInt(); }


  /**
   * масса Эмпирическое рапределение
   */
  public CustomDistribution масса;

  public double масса() { return масса.get(); }

  // Области
  public ViewArea viewArea = new ViewArea( this, null, 0, 0, 950, 600 );
  public ViewArea _origin_VA = new ViewArea( this, "[Нач. координат]", 0, 0, 1440.0, 900.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "viewArea", this.viewArea );
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 2 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _editbox_Font = new Font("Dialog", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _checkbox_Font = _editbox_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _radio_Font = _editbox_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 1, 16 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("SansSerif", 0, 18 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = new Font("SansSerif", 0, 16 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = _text1_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = new Font("SansSerif", 2, 14 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text2_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = new Font("SansSerif", 0, 20 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = _text9_Font;
  protected static final Color __ps278_Fill_Color = new Color( 0x50000000, true );
  protected static final Color __ps279_Fill_Color = new Color( 0xFFDCB200, true );
  protected static final Color __ps280_Fill_Color = new Color( 0xFF806000, true );
  protected static final Color __ps281_Fill_Color = new Color( 0xFFD0A200, true );
  protected static final Color __ps283_Fill_Color = new Color( 0xFFFFE576, true );
  protected static final Color __ps284_Line_Color = new Color( 0xFF4A3500, true );
  @AnyLogicInternalCodegenAPI
  protected static final int _editbox = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _slider = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _checkbox = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _slider1 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _radio = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps278 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps279 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps280 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps281 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps282 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps283 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps284 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _warehouse = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 27;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 28;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDX_xjal() {
    return new double[] { 0.0, 3.483, 17.413, 13.929,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDY_xjal() {
    return new double[] { 0.0, 1.652, -4.959, -6.612,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps278_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 5.223, 10.448, 10.448,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDY_xjal() {
    return new double[] { 0.0, -5.786, -6.612, -0.827, 4.959,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps279_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDX_xjal() {
    return new double[] { 0.0, 6.965, 6.965, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDY_xjal() {
    return new double[] { 0.0, 3.307, -0.827, -4.134,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps280_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDX_xjal() {
    return new double[] { 0.0, 13.929, 13.929, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDY_xjal() {
    return new double[] { 0.0, -6.612, -12.398, -5.786,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps281_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDX_xjal() {
    return new double[] { 0.0, 13.929, 8.707, -5.223,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDY_xjal() {
    return new double[] { 0.0, -6.612, -12.398, -5.786,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps282_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDX_xjal() {
    return new double[] { 0.0, 13.929, 8.707, -5.223,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDY_xjal() {
    return new double[] { 0.0, -6.612, -5.786, 0.827,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps283_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDX_xjal() {
    return new double[] { 0.0, 13.929, 13.929, 8.707, 3.483, -10.448, -10.448,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDY_xjal() {
    return new double[] { 0.0, -6.612, -12.398, -18.184, -17.357, -10.745, -4.959,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps284_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(warehouse, text, text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, editbox, slider, checkbox, slider1, radio);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _warehouse:
        if (true) {
          ShapeGroup self = this.warehouse;
          
viewArea.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index, boolean value ) {
    switch( _shape ) {
      case _checkbox: {
          ShapeCheckBox self = this.checkbox;
if (!checkbox.isSelected()) {
	Запрос.reset();
}
else {
	Запрос.restart();
}	 
;}
        break;
      default:
        super.executeShapeControlAction( _shape, index, value );
        break;
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index, int value ) {
    switch( _shape ) {
      case _radio:
        переключатель = value;
        break;
      default:
        super.executeShapeControlAction( _shape, index, value );
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
      default:
        super.executeShapeControlAction( _shape, index, value );
        break;
    }
  }
        
  @Override
  @AnyLogicInternalCodegenAPI
  public int getShapeControlDefaultValueInt( int _shape, int index ) {
    switch(_shape) {
      case _radio: return 
переключатель 
;
      default: return super.getShapeControlDefaultValueInt( _shape, index );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getShapeControlDefaultValueDouble( int _shape, int index ) {
    switch(_shape) {
      case _slider: return 
0 
;
      case _slider1: return 
0 
;
      default: return super.getShapeControlDefaultValueDouble( _shape, index );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getShapeControlDefaultValueString( int _shape, int index ) {
    switch(_shape) {
      case _editbox: return String.valueOf(
объёмЗаказ 
);
      default: return super.getShapeControlDefaultValueString( _shape, index );
    }
  }

  protected ShapeTextField editbox;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
7 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
48 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider;
  protected ShapeCheckBox checkbox;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider1_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
4 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
56 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider1;
  protected ShapeRadioButtonGroup radio;
  protected ShapePolyLine _ps278;
  protected ShapePolyLine _ps279;
  protected ShapePolyLine _ps280;
  protected ShapePolyLine _ps281;
  protected ShapePolyLine _ps282;
  protected ShapePolyLine _ps283;
  protected ShapePolyLine _ps284;
  protected ShapeGroup warehouse;
  protected ShapeText text;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text1_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider.getValue() 
);
  }
  
  protected ShapeText text1;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text2_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
Запрос.getRest() 
);
  }
  
  protected ShapeText text2;
  protected ShapeText text3;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text4_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider1.getValue() 
);
  }
  
  protected ShapeText text4;
  protected ShapeText text5;
  protected ShapeText text6;
  protected ShapeText text7;
  protected ShapeText text8;
  protected ShapeText text9;
  protected ShapeText text10;
  protected ShapeText text11;
  protected ShapeText text12;
  protected ShapeText text13;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    editbox = new ShapeTextField(
			Склад.this, false,290.0, 210.0, 
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

    slider = new ShapeSlider(
		    Склад.this, false, 290.0, 310.0, 
			100.0, 30.0,
            true, false,
            7
            , 48
            , 0
            , ShapeControl.TYPE_DOUBLE ) {
      @Override
      public void updateDynamicProperties() {
        _slider_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider, 0 ), getMax() ) );
      }
    };

    checkbox = new ShapeCheckBox(
		Склад.this,false,290.0, 30.0, 
		100.0, 30.0,
            controlDefault, true,
            _checkbox_Font,
			"Включить" ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _checkbox, 0, value );
      }
    };

    slider1 = new ShapeSlider(
		    Склад.this, false, 290.0, 280.0, 
			100.0, 30.0,
            true, false,
            4
            , 56
            , 0
            , ShapeControl.TYPE_DOUBLE ) {
      @Override
      public void updateDynamicProperties() {
        _slider1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider1, 0 ), getMax() ) );
      }
    };

    radio = new ShapeRadioButtonGroup(
		    Склад.this, false, 190.0, 150.0, 
			150.0, 100.0,
            controlDefault, true,
            _radio_Font, true, 
            new String[]{"1", "2", "3", } ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _radio, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setValue( getShapeControlDefaultValueInt( _radio, 0 ) );
      }
    };

    _ps278 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.613, 9.919, 0.0, null, __ps278_Fill_Color,
            4, __ps278_pointsDX_xjal(), __ps278_pointsDY_xjal(), __ps278_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps279 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -13.059, 4.959, 0.0, null, __ps279_Fill_Color,
            5, __ps279_pointsDX_xjal(), __ps279_pointsDY_xjal(), __ps279_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps280 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -11.318, 5.786, 0.0, null, __ps280_Fill_Color,
            4, __ps280_pointsDX_xjal(), __ps280_pointsDY_xjal(), __ps280_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps281 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.613, 9.919, 0.0, null, __ps281_Fill_Color,
            4, __ps281_pointsDX_xjal(), __ps281_pointsDY_xjal(), __ps281_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps282 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.613, 4.134, 0.0, null, gold,
            4, __ps282_pointsDX_xjal(), __ps282_pointsDY_xjal(), __ps282_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps283 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -7.835, -1.652, 0.0, null, __ps283_Fill_Color,
            4, __ps283_pointsDX_xjal(), __ps283_pointsDY_xjal(), __ps283_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps284 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -2.613, 9.919, 0.0, __ps284_Line_Color, null,
            7, __ps284_pointsDX_xjal(), __ps284_pointsDY_xjal(), __ps284_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    text = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 90.0, 0.0, 0.0, 
        black,"Масса заказа",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D, false,400.0, 310.0, 0.0, 0.0, 
        black,"",
        _text1_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text2 = new ShapeText(
        SHAPE_DRAW_2D, false,290.0, 250.0, 0.0, 0.0, 
        black,"",
        _text2_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text3 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 30.0, 0.0, 0.0, 
        black,"Генерация \r\nзаказа",
        _text3_Font, ALIGNMENT_LEFT );

    text4 = new ShapeText(
        SHAPE_DRAW_2D, false,400.0, 280.0, 0.0, 0.0, 
        black,"",
        _text4_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text4_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text5 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 280.0, 0.0, 0.0, 
        black,"Нижняя граница",
        _text5_Font, ALIGNMENT_LEFT );

    text6 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 310.0, 0.0, 0.0, 
        black,"Верхняя граница",
        _text6_Font, ALIGNMENT_LEFT );

    text7 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 250.0, 0.0, 0.0, 
        black,"Период заказа:",
        _text7_Font, ALIGNMENT_LEFT );

    text8 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 120.0, 0.0, 0.0, 
        black,"Источник:\r\n",
        _text8_Font, ALIGNMENT_LEFT );

    text9 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 150.0, 0.0, 0.0, 
        black,"Форма",
        _text9_Font, ALIGNMENT_LEFT );

    text10 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 176.0, 0.0, 0.0, 
        black,"Случ.",
        _text10_Font, ALIGNMENT_LEFT );

    text11 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 220.0, 0.0, 0.0, 
        black,"Масса:",
        _text11_Font, ALIGNMENT_LEFT );

    text12 = new ShapeText(
        SHAPE_DRAW_2D, false,40.0, 380.0, 0.0, 0.0, 
        black,"Московский 0\r\nЖелезнодорожный 1\r\nКрасногорский 2\r\nСосенский 3\r\nКовровский 4\r\nТулиновский 5",
        _text12_Font, ALIGNMENT_LEFT );

    text13 = new ShapeText(
        SHAPE_DRAW_2D, false,140.0, 200.0, 0.0, 0.0, 
        black,"Данные",
        _text13_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    warehouse = new ShapeGroup( Склад.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps278
	     , _ps279
	     , _ps280
	     , _ps281
	     , _ps282
	     , _ps283
	     , _ps284 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _warehouse, 0, clickx, clicky );
      }
    };

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
  public Склад( Engine engine, Agent owner, AgentList<? extends Склад> ownerPopulation ) {
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
    enter = instantiate_enter_xjal();
    delay = instantiate_delay_xjal();
    sink = instantiate_sink_xjal();
    enter1 = instantiate_enter1_xjal();
    delay1 = instantiate_delay1_xjal();
    sink1 = instantiate_sink1_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Склад() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Склад( String склад, String адрес, double таймаут ) {
    markParametersAreSet();
    this.склад = склад;
    this.адрес = адрес;
    this.таймаут = таймаут;
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
	if (заказов_с_Красногорска == null) {
		заказов_с_Красногорска = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT заказы FROM заказыс_красногорска").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (цельКрасногорск == null) {
		цельКрасногорск = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT цель FROM цели_красногорска").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (заказов_с_Московского == null) {
		заказов_с_Московского = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT заказы FROM заказы_московский").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (заказов_с_ЖД == null) {
		заказов_с_ЖД = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT заказы FROM заказы_жд").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (цельМосковский == null) {
		цельМосковский = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT цель FROM цели_московский").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (цельЖД == null) {
		цельЖД = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT цель FROM цели_жд").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
	if (масса == null) {
		масса = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT масса FROM масса").setOwner(this).buildCustomDistribution(
		  "SAMPLE", CUSTOM_DISTRIBUTION_INTERPOLATION_NONE
		);
    }
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Склад_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Склад.this, true, 0, 0, 0, 0 , level );
    // Создание экземпляров вложенных объектов
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Склад.this, getElementProperty( "пробавперёд.Склад.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Инициализация агентных сред
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    disableSteps();
    setNetworkUserDefined();
    setLayoutType( LAYOUT_USER_DEFINED );
    // Создание нереплицированных вложенных объектов
    setupParameters_enter_xjal( enter, null );
    doBeforeCreate_enter_xjal( enter, null );
    enter.createAsEmbedded();
    setupParameters_delay_xjal( delay, null );
    doBeforeCreate_delay_xjal( delay, null );
    delay.createAsEmbedded();
    setupParameters_sink_xjal( sink, null );
    doBeforeCreate_sink_xjal( sink, null );
    sink.createAsEmbedded();
    setupParameters_enter1_xjal( enter1, null );
    doBeforeCreate_enter1_xjal( enter1, null );
    enter1.createAsEmbedded();
    setupParameters_delay1_xjal( delay1, null );
    doBeforeCreate_delay1_xjal( delay1, null );
    delay1.createAsEmbedded();
    setupParameters_sink1_xjal( sink1, null );
    doBeforeCreate_sink1_xjal( sink1, null );
    sink1.createAsEmbedded();
	 // Соединители с нереплицированными объектами
    sink.in.connect( delay.out ); // connector1
    delay1.in.connect( enter1.out ); // connector2
    sink1.in.connect( delay1.out ); // connector3
    delay.in.connect( enter.out ); // connector4
    // Создание реплицированных вложенных объектов
    маркерыЖД.setEnvironment( this );
    for ( int i = 0; i < маркерыЖД.size(); i++ ) {
      маркерЖД _a = маркерыЖД.get(i); 
      setupParameters_маркерыЖД_xjal( _a, i, null );
      doBeforeCreate_маркерыЖД_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    маркерыМос.setEnvironment( this );
    for ( int i = 0; i < маркерыМос.size(); i++ ) {
      маркерМос _a = маркерыМос.get(i); 
      setupParameters_маркерыМос_xjal( _a, i, null );
      doBeforeCreate_маркерыМос_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Склад.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
    editbox.setValueToDefault();
    slider.setValueToDefault();
    slider1.setValueToDefault();
    radio.setValueToDefault();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    Запрос.start();
    for (Agent embeddedObject : маркерыЖД) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : маркерыМос) {
      embeddedObject.startAsEmbedded();
    }
    enter.startAsEmbedded();
    delay.startAsEmbedded();
    sink.startAsEmbedded();
    enter1.startAsEmbedded();
    delay1.startAsEmbedded();
    sink1.startAsEmbedded();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
checkbox.setSelected(false);
//Запрос.reset();
radio.setValue(2); 
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Склад_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Склад_xjal() {
    объёмЗаказ = 
1 
;
    переключатель = 
1 
;
    variable = 
0 
;
    variable1 = 
0 
;
  }

  // API пользователя -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

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

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( enter );
    list.add( delay );
    list.add( sink );
    list.add( маркерыЖД );
    list.add( enter1 );
    list.add( delay1 );
    list.add( sink1 );
    list.add( маркерыМос );
    return list;
  }

  public AgentList<? extends Склад> getPopulation() {
    return (AgentList<? extends Склад>) super.getPopulation();
  }

  public List<? extends Склад> agentsInRange( double distance ) {
    return (List<? extends Склад>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    Запрос.onDestroy();
    enter.onDestroy();
    delay.onDestroy();
    sink.onDestroy();
    for (Agent _item : маркерыЖД) {
      _item.onDestroy();
    }
    enter1.onDestroy();
    delay1.onDestroy();
    sink1.onDestroy();
    for (Agent _item : маркерыМос) {
      _item.onDestroy();
    }
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    enter.doFinish();
    delay.doFinish();
    sink.doFinish();
    for (Agent _item : маркерыЖД) {
      _item.doFinish();
    }
    enter1.doFinish();
    delay1.doFinish();
    sink1.doFinish();
    for (Agent _item : маркерыМос) {
      _item.doFinish();
    }
  }



}
