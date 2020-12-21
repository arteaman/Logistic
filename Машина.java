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

public class Машина extends Agent
{
  // Параметры

  public 
String  наименование;

  /**
   * Возвращает значение по умолчанию параметра <code>наименование</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public String _наименование_DefaultValue_xjal() {
    final Машина self = this;
    return null;
  }

  public void set_наименование( String value ) {
    if (value == this.наименование) {
      return;
    }
    String _oldValue_xjal = this.наименование;
    this.наименование = value;
    onChange_наименование_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter наименование.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_наименование()</code> method instead.
   */
  protected void onChange_наименование() {
    onChange_наименование_xjal( наименование );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_наименование_xjal( String oldValue ) {  
  }


  public 
int  скорость;

  /**
   * Возвращает значение по умолчанию параметра <code>скорость</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _скорость_DefaultValue_xjal() {
    final Машина self = this;
    return 0;
  }

  public void set_скорость( int value ) {
    if (value == this.скорость) {
      return;
    }
    int _oldValue_xjal = this.скорость;
    this.скорость = value;
    onChange_скорость_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter скорость.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_скорость()</code> method instead.
   */
  protected void onChange_скорость() {
    onChange_скорость_xjal( скорость );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_скорость_xjal( int oldValue ) {  
  }


  public 
int  количество;

  /**
   * Возвращает значение по умолчанию параметра <code>количество</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _количество_DefaultValue_xjal() {
    final Машина self = this;
    return 0;
  }

  public void set_количество( int value ) {
    if (value == this.количество) {
      return;
    }
    int _oldValue_xjal = this.количество;
    this.количество = value;
    onChange_количество_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter количество.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_количество()</code> method instead.
   */
  protected void onChange_количество() {
    onChange_количество_xjal( количество );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_количество_xjal( int oldValue ) {  
  }


  public 
int  вместимость;

  /**
   * Возвращает значение по умолчанию параметра <code>вместимость</code>.
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _вместимость_DefaultValue_xjal() {
    final Машина self = this;
    return 0;
  }

  public void set_вместимость( int value ) {
    if (value == this.вместимость) {
      return;
    }
    int _oldValue_xjal = this.вместимость;
    this.вместимость = value;
    onChange_вместимость_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter вместимость.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_вместимость()</code> method instead.
   */
  protected void onChange_вместимость() {
    onChange_вместимость_xjal( вместимость );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_вместимость_xjal( int oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    наименование = _наименование_DefaultValue_xjal();
    скорость = _скорость_DefaultValue_xjal();
    количество = _количество_DefaultValue_xjal();
    вместимость = _вместимость_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "наименование":
      if ( _callOnChange_xjal ) {
        set_наименование( (String) _value_xjal );
      } else {
        наименование = (String) _value_xjal;
      }
      return true;
    case "скорость":
      if ( _callOnChange_xjal ) {
        set_скорость( ((Number) _value_xjal).intValue() );
      } else {
        скорость = ((Number) _value_xjal).intValue();
      }
      return true;
    case "количество":
      if ( _callOnChange_xjal ) {
        set_количество( ((Number) _value_xjal).intValue() );
      } else {
        количество = ((Number) _value_xjal).intValue();
      }
      return true;
    case "вместимость":
      if ( _callOnChange_xjal ) {
        set_вместимость( ((Number) _value_xjal).intValue() );
      } else {
        вместимость = ((Number) _value_xjal).intValue();
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
    case "наименование": _result_xjal = наименование; break;
    case "скорость": _result_xjal = скорость; break;
    case "количество": _result_xjal = количество; break;
    case "вместимость": _result_xjal = вместимость; break;
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
      list.add( "наименование" );
      list.add( "скорость" );
      list.add( "количество" );
      list.add( "вместимость" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Простые переменные

  public 
Заказ 
 заказ;
  public 
int 
 X;
  public 
double 
 коэф_загрузки;
  public 
int 
 занят;
  public 
double 
 расстояние_груз;
  public 
double 
 расстояние_сумм;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Машина.class );
  
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
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Диаграммы состояний
  public Statechart<statechart_state> statechart = new Statechart<>( this, (short)1 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.statechart) return "statechart";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.statechart) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.statechart ) {
      enterState( вТерминале, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // Состояния всех диаграмм состояний
   
  public enum statechart_state implements IStatechartState<Машина, statechart_state> {
    вТерминале,
    загрузка,
    наСкладЗаказчик,
    погрузка,
    наСкладНазначение,
    разгрузка,
    наТерминал,
    наСкладе,
    branch;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart_state> getSimpleStatesDeep() {
      Collection<statechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart_state> getFullState() {
      Set<statechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart_state> getStatesInside() {
      Set<statechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart_state> getStatechart( Машина _a ) {
      return _a.statechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state вТерминале = statechart_state.вТерминале;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state загрузка = statechart_state.загрузка;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state наСкладЗаказчик = statechart_state.наСкладЗаказчик;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state погрузка = statechart_state.погрузка;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state наСкладНазначение = statechart_state.наСкладНазначение;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state разгрузка = statechart_state.разгрузка;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state наТерминал = statechart_state.наТерминал;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state наСкладе = statechart_state.наСкладе;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state branch = statechart_state.branch;


  @AnyLogicInternalCodegenAPI
  private void enterState( statechart_state self, boolean _destination ) {
    switch( self ) {
      case вТерминале:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( вТерминале );
        transition.start();
        return;
      case загрузка:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( загрузка );
        transition4.start();
        return;
      case наСкладЗаказчик:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( наСкладЗаказчик );
        transition1.start();
        return;
      case погрузка:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( погрузка );
        {
dest1.setText( "погрузка" );
dest.setText( "" ); 
;}
        transition3.start();
        return;
      case наСкладНазначение:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( наСкладНазначение );
        {
X = function(); 
;}
        transition2.start();
        return;
      case разгрузка:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( разгрузка );
        {
dest1.setText( "разгрузка" );
dest.setText( "" ); 
;}
        transition7.start();
        return;
      case наТерминал:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( наТерминал );
        transition5.start();
        return;
      case наСкладе:
  	    logToDBEnterState(statechart, self);
        // (Простое состояние (не сложное))
        statechart.setActiveState_xjal( наСкладе );
        transition10.start();
        return;
      case branch:
  	    logToDBEnterState(statechart, self);
        // (Ветвление)
        if ( 
X == 1

	 
 ) { // transition9
          {
main.терминал.delivering1.stopDelay( заказ );
dest1.setText( "" );
занят = 0;

main.терминал.расстояние_все = main.терминал.расстояние_все + расстояние_сумм;
main.терминал.груз_все = main.терминал.груз_все + расстояние_груз;
main.терминал.коэф_загрузки_все = main.терминал.груз_все/main.терминал.расстояние_все;

коэф_загрузки = расстояние_груз/расстояние_сумм; 
;}
          enterState( наСкладе, true );
          return;
        }
        // transition8 (default)
          {

moveTo( main.терминал );
dest1.setText( "" );

расстояние_сумм = расстояние_сумм + distanceTo(main.терминал); 
;}
          enterState( наТерминал, true );
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case вТерминале: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition) transition.cancel();
        return;
      case загрузка: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition4) transition4.cancel();
        return;
      case наСкладЗаказчик: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition1) transition1.cancel();
        return;
      case погрузка: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition3) transition3.cancel();
        return;
      case наСкладНазначение: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition2) transition2.cancel();
        return;
      case разгрузка: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition7) transition7.cancel();
        return;
      case наТерминал: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition5) transition5.cancel();
        return;
      case наСкладе: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Простое состояние (не сложное))
        if ( !_source || _t != transition10) transition10.cancel();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart_state _destination ) {
    statechart_state _state = statechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout transition4 = new TransitionTimeout( this );
  public TransitionTimeout transition3 = new TransitionTimeout( this );
  public TransitionTimeout transition7 = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == transition4 ) return "transition4";
    if ( _t == transition3 ) return "transition3";
    if ( _t == transition7 ) return "transition7";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == transition4 ) return statechart;
    if ( _t == transition3 ) return statechart;
    if ( _t == transition7 ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == transition4 ) {
      exitState( загрузка, self, true );
      {
moveTo( заказ.заказчик );
dest1.setText( "забираю" );
dest.setText( заказ.заказчик.склад);

расстояние_сумм = расстояние_сумм + distanceTo(заказ.заказчик); 
;}
          enterState( наСкладЗаказчик, true );
      return;
    }
    if ( self == transition3 ) {
      exitState( погрузка, self, true );
      {
moveTo( заказ.назначение );
dest1.setText( "отвожу" );
dest.setText( заказ.назначение.склад );

расстояние_сумм = расстояние_сумм + distanceTo(заказ.назначение);
расстояние_груз = расстояние_груз + distanceTo(заказ.назначение); 
;}
          enterState( наСкладНазначение, true );
      return;
    }
    if ( self == transition7 ) {
      exitState( разгрузка, self, true );
          enterState( branch, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == transition4 ) {
      _value = 
uniform( 0.5, 1 )  
;
      _value = toModelTime( _value, HOUR );
      return _value;
    }
    if ( _t == transition3 ) {
      _value = 
uniform( 1, 2 )  
;
      _value = toModelTime( _value, HOUR );
      return _value;
    }
    if ( _t == transition7 ) {
      _value = 
uniform( 1, 2 )  
;
      _value = toModelTime( _value, HOUR );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }



  public TransitionMessage transition = new TransitionMessage( this );
  public TransitionMessage transition1 = new TransitionMessage( this );
  public TransitionMessage transition2 = new TransitionMessage( this );
  public TransitionMessage transition5 = new TransitionMessage( this );
  public TransitionMessage transition10 = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition ) return "transition";
    if ( _t == transition1 ) return "transition1";
    if ( _t == transition2 ) return "transition2";
    if ( _t == transition5 ) return "transition5";
    if ( _t == transition10 ) return "transition10";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition ) return statechart;
    if ( _t == transition1 ) return statechart;
    if ( _t == transition2 ) return statechart;
    if ( _t == transition5 ) return statechart;
    if ( _t == transition10 ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition ) {
      exitState( вТерминале, self, true );
      {
        Заказ msg = (Заказ) _msg;
заказ = msg;
занят = 1; 
;}
          enterState( загрузка, true );
      return;
    }
    if ( self == transition1 ) {
      exitState( наСкладЗаказчик, self, true );
          enterState( погрузка, true );
      return;
    }
    if ( self == transition2 ) {
      exitState( наСкладНазначение, self, true );
          enterState( разгрузка, true );
      return;
    }
    if ( self == transition5 ) {
      exitState( наТерминал, self, true );
      {
main.терминал.delivering1.stopDelay( заказ );
занят = 0;
main.терминал.расстояние_все = main.терминал.расстояние_все + расстояние_сумм;
main.терминал.груз_все = main.терминал.груз_все + расстояние_груз;
main.терминал.коэф_загрузки_все = main.терминал.груз_все/main.терминал.расстояние_все;

коэф_загрузки = расстояние_груз/расстояние_сумм; 
;}
          enterState( вТерминале, true );
      return;
    }
    if ( self == transition10 ) {
      exitState( наСкладе, self, true );
      {
        Заказ msg = (Заказ) _msg;
заказ = msg;
занят = 1; 
;}
          enterState( загрузка, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition ) {
      if ( !(_msg instanceof Заказ) )
        return false;
      
Заказ 
msg = (Заказ) _msg;
      return true;
    }
    if ( _t == transition1 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == transition2 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == transition5 ) {
      return _msg == _ARRIVAL_message_xjal;
    }
    if ( _t == transition10 ) {
      if ( !(_msg instanceof Заказ) )
        return false;
      
Заказ 
msg = (Заказ) _msg;
      return true;
    }
    return super.testMessageOf( _t, _msg );
  }
  // Функции

  
int 
 function(  ) { 

int A = 0;
for ( int i=0; i < main.заказы.size(); i++ ) {
	if ( main.заказы.get(i).заказчик.getIndex() == заказ.назначение.getIndex() ) 
		A = 1;
}
return A; 
  }
  // Области
  public ViewArea viewArea = new ViewArea( this, null, 0, 0, 1440, 820 );
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
  protected static final Font _dest_Font = new Font("SansSerif", 0, 10 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _dest1_Font = _dest_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _dest2_Font = _dest_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _dest3_Font = _dest_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = _dest_Font;
  protected static final Color __ps111_Fill_Color = new Color( 0xFFB80000, true );
  protected static final Color __ps111_Line_Color = new Color( 0xFF371616, true );
  protected static final Color __ps113_Fill_Color = new Color( 0xFFDA0000, true );
  protected static final Color __ps113_Line_Color = new Color( 0xFF802319, true );
  protected static final Color __ps115_Fill_Color = new Color( 0xFFDA0000, true );
  protected static final Color __ps116_Fill_Color = new Color( 0xFF333556, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps107 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps108 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps109 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps110 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps111 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps112 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps113 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps114 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps115 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps116 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps117 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps118 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps106 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps120 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps121 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps119 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _truck = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _dest = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _dest1 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _dest2 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _dest3 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 22;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 23;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps111_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 4.41, 4.41, 4.41, 5.04, 5.04, 5.04, 5.984, 6.614, 6.929, 6.929, 6.614, 5.984, 5.04, 5.04, 5.04, 4.41, 4.41, 4.41, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps111_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 3.693, 3.693, 3.693, 3.693, 3.693, 3.693, 3.939, 3.939, 3.939, 3.693, 3.447, 2.709, 1.23, 0.247, 0.0, -0.246, -0.246, -0.246, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps111_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps113_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, -2.519, -2.519, -2.519, -2.519, -2.519, -2.519, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps113_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 0.493, 0.493, 0.493, -2.215, -2.215, -2.215, -1.723, -1.723, -1.723, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps113_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps115_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 2.835, 3.465, 3.465, 3.465, 3.465, 2.835, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps115_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 0.0, -0.246, -0.985, -2.215, -2.953, -3.2, -3.2, -3.2, -3.2, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps115_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps116_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 0.944, 0.944, 0.944, 0.944, 0.944, 0.944, 0.0, 0.0, 0.0, 0.315, 0.315, 0.315, 0.315, 0.315, 0.315, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps116_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, -0.246, -0.738, -1.476, -1.723, -2.215, -2.953, -3.2, -3.2, -3.2, -2.707, -1.969, -1.476, -1.476, -0.738, -0.246, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps116_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps117_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, -0.314, -0.314, -0.314, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps117_pointsDY_xjal() {
    return new double[] { 0.0, 0.247, 0.493, 0.0, -0.491, -0.246,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps117_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps118_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, -0.314, -0.314, -0.314, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps118_pointsDY_xjal() {
    return new double[] { 0.0, 0.247, 0.493, 0.0, -0.491, -0.246,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps118_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(truck, dest, dest1, dest2, dest3, text);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _truck:
        if (true) {
          ShapeGroup self = this.truck;
          
viewArea.navigateTo(); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapeRectangle _ps107;
  protected ShapeRectangle _ps108;
  protected ShapeRectangle _ps109;
  protected ShapeRectangle _ps110;
  protected ShapeCurve _ps111;
  protected ShapeRectangle _ps112;
  protected ShapeCurve _ps113;
  protected ShapeRectangle _ps114;
  protected ShapeCurve _ps115;
  protected ShapeCurve _ps116;
  protected ShapeCurve _ps117;
  protected ShapeCurve _ps118;
  protected ShapeGroup _ps106;
  protected ShapeRectangle _ps120;
  protected ShapeRoundedRectangle _ps121;
  protected ShapeGroup _ps119;
  protected ShapeGroup truck;
  protected ShapeText dest;
  protected ShapeText dest1;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _dest2_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
getIndex() 
);
  }
  
  protected ShapeText dest2;
  protected ShapeText dest3;
  
  /**
   * <i>Пользователь не должен вызывать этот метод</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
занят 
);
  }
  
  protected ShapeText text;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps107 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-21.26, -1.723, 0.0, 0.0, 
            null, darkGray,
			7.874, 3.2, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps108 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-18.425, -2.215, 0.0, 0.0, 
            null, black,
			1.89, 4.185, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps109 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-8.662, 1.477, 0.0, 1.5707963267948966, 
            gray, gray,
			0.493, 5.04, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps110 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-8.662, -2.215, 0.0, 1.5707963267948966, 
            gray, gray,
			0.493, 5.04, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps111 = new ShapeCurve(
      true,-13.7, -1.969, 
      __ps111_Line_Color, __ps111_Fill_Color,
      24, true, __ps111_pointsDX_xjal(), __ps111_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps112 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-14.646, -1.723, 0.0, 0.0, 
            null, gray,
			0.631, 1.97, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps113 = new ShapeCurve(
      true,-7.087, 0.739, 
      __ps113_Line_Color, __ps113_Fill_Color,
      12, true, __ps113_pointsDX_xjal(), __ps113_pointsDY_xjal(),
 	false, 1.0, LINE_STYLE_SOLID    );

    _ps114 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-20.631, -2.215, 0.0, 0.0, 
            null, black,
			1.89, 4.185, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps115 = new ShapeCurve(
      true,-13.7, 1.477, 
      null, __ps115_Fill_Color,
      12, true, __ps115_pointsDX_xjal(), __ps115_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps116 = new ShapeCurve(
      true,-10.236, 1.477, 
      null, __ps116_Fill_Color,
      18, true, __ps116_pointsDX_xjal(), __ps116_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps117 = new ShapeCurve(
      true,-8.347, -2.461, 
      null, black,
      6, true, __ps117_pointsDX_xjal(), __ps117_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps118 = new ShapeCurve(
      true,-8.347, 2.215, 
      null, black,
      6, true, __ps118_pointsDX_xjal(), __ps118_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

    _ps120 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,2.731, -2.461, 0.0, 0.0, 
            black, silver,
			22.993, 4.677, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps121 = new ShapeRoundedRectangle(
		true,3.047, -1.969, 0.0, 
        null, white,
		22.362, 3.693,1.0,  
		1.0, LINE_STYLE_SOLID	 );

    dest = new ShapeText(
        SHAPE_DRAW_2D, true,-20.0, -15.0, 0.0, 0.0, 
        black,"",
        _dest_Font, ALIGNMENT_LEFT );

    dest1 = new ShapeText(
        SHAPE_DRAW_2D, true,-20.0, -20.0, 0.0, 0.0, 
        black,"",
        _dest1_Font, ALIGNMENT_LEFT );

    dest2 = new ShapeText(
        SHAPE_DRAW_2D, true,-20.0, 10.0, 0.0, 0.0, 
        black,"",
        _dest2_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _dest2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    dest3 = new ShapeText(
        SHAPE_DRAW_2D, true,-20.0, 0.0, 0.0, 0.0, 
        black,"Машина №",
        _dest3_Font, ALIGNMENT_LEFT );

    text = new ShapeText(
        SHAPE_DRAW_2D, true,-10.0, 20.0, 0.0, 0.0, 
        black,"text",
        _text_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    _ps106 = new ShapeGroup( Машина.this, SHAPE_DRAW_2D, true, 20.0, 0.0, 0.0, 0.0
	
	     , _ps107
	     , _ps108
	     , _ps109
	     , _ps110
	     , _ps111
	     , _ps112
	     , _ps113
	     , _ps114
	     , _ps115
	     , _ps116
	     , _ps117
	     , _ps118 );

    }
    {				
    _ps119 = new ShapeGroup( Машина.this, SHAPE_DRAW_2D, true, -21.0, 0.0, 0.0, 0.0
	
	     , _ps120
	     , _ps121 );

    }
    {				
    truck = new ShapeGroup( Машина.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps106
	     , _ps119 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _truck, 0, clickx, clicky );
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

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    statechart.fireEvent( _ARRIVAL_message_xjal );
  }

  /**
   * Конструктор
   */
  public Машина( Engine engine, Agent owner, AgentList<? extends Машина> ownerPopulation ) {
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
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Машина() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Машина( String наименование, int скорость, int количество, int вместимость ) {
    markParametersAreSet();
    this.наименование = наименование;
    this.скорость = скорость;
    this.количество = количество;
    this.вместимость = вместимость;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Присвоение начальных значений простым переменным
    setupPlainVariables_Машина_xjal();
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Машина.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Машина.this, getElementProperty( "пробавперёд.Машина.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Соединители с нереплицированными объектами
    // Создание реплицированных вложенных объектов
    setupInitialConditions_xjal( Машина.class );
    // Динамическая инициализация элементов, у которых разрешено программное управление
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    statechart.start();
  }
 

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Машина_xjal();
  }

  /**
   * Присвоение начальных значений простым переменным<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Машина_xjal() {
    занят = 
0 
;
    расстояние_груз = 
0 
;
    расстояние_сумм = 
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
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    statechart.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Машина> getPopulation() {
    return (AgentList<? extends Машина>) super.getPopulation();
  }

  public List<? extends Машина> agentsInRange( double distance ) {
    return (List<? extends Машина>) super.agentsInRange( distance );
  }

  // Действие при изменении -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    super.onDestroy();
  }



}
