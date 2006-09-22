/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.impl.MessageFormatter;
import org.ops4j.pax.logging.PaxLogger;
import org.ops4j.pax.logging.PaxLoggingManager;

public class Slf4jLogger
    implements Logger
{

    private String m_name;

    private PaxLogger m_delegate;

    public Slf4jLogger( String name, PaxLogger delegate )
    {
        m_name = name;
        m_delegate = delegate;
    }

    /**
     * Return the name of this <code>Logger</code> instance.
     */
    public String getName()
    {
        return m_name;
    }

    /**
     * Is the logger instance enabled for the DEBUG level?
     *
     * @return True if this Logger is enabled for the DEBUG level,
     *         false otherwise.
     */
    public boolean isDebugEnabled()
    {
        return m_delegate.isDebugEnabled();
    }

    /**
     * Log a message at the DEBUG level.
     *
     * @param msg the message string to be logged
     */
    public void debug( String msg )
    {
        if( m_delegate.isDebugEnabled() )
        {
            m_delegate.debug( msg, null );
        }
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and argument.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    public void debug( String format, Object arg )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.debug( message, null );
        }
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void debug( String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.debug( message, null );
        }
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void debug( String format, Object[] argArray )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.debug( message, null );
        }
    }

    /**
     * Log an exception (throwable) at the DEBUG level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    public void debug( String msg, Throwable t )
    {
        if( m_delegate.isDebugEnabled() )
        {
            m_delegate.debug( msg, t );
        }
    }

    /**
     * Similar to {@link #isDebugEnabled()} method except that the
     * marker data is also taken into account.
     *
     * @param marker The marker data to take into consideration
     */
    public boolean isDebugEnabled( Marker marker )
    {
        return m_delegate.isDebugEnabled();
    }

    /**
     * Log a message with the specific Marker at the DEBUG level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message string to be logged
     */
    public void debug( Marker marker, String msg )
    {
        if( m_delegate.isDebugEnabled() )
        {
            m_delegate.debug( msg, null );
        }
    }

    /**
     * This method is similar to {@link #debug(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    public void debug( Marker marker, String format, Object arg )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.debug( message, null );
        }
    }

    /**
     * This method is similar to {@link #debug(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void debug( Marker marker, String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.debug( message, null );
        }
    }

    /**
     * This method is similar to {@link #debug(String, Object[])}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void debug( Marker marker, String format, Object[] argArray )
    {
        if( m_delegate.isDebugEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.debug( message, null );
        }
    }

    /**
     * This method is similar to {@link #debug(String, Throwable)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    public void debug( Marker marker, String msg, Throwable t )
    {
        if( m_delegate.isDebugEnabled() )
        {
            m_delegate.debug( msg, t );
        }
    }

    /**
     * Is the logger instance enabled for the INFO level?
     *
     * @return True if this Logger is enabled for the INFO level,
     *         false otherwise.
     */
    public boolean isInfoEnabled()
    {
        return m_delegate.isInfoEnabled();
    }

    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     */
    public void info( String msg )
    {
        if( m_delegate.isInfoEnabled() )
        {
            m_delegate.inform( msg, null );
        }
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and argument.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    public void info( String format, Object arg )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.inform( message, null );
        }
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void info( String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.inform( message, null );
        }
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void info( String format, Object[] argArray )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.inform( message, null );
        }
    }

    /**
     * Log an exception (throwable) at the INFO level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    public void info( String msg, Throwable t )
    {
        if( m_delegate.isInfoEnabled() )
        {
            m_delegate.inform( msg, t );
        }
    }

    /**
     * Similar to {@link #isInfoEnabled()} method except that the marker
     * data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     */
    public boolean isInfoEnabled( Marker marker )
    {
        return m_delegate.isInfoEnabled();
    }

    /**
     * Log a message with the specific Marker at the INFO level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    public void info( Marker marker, String msg )
    {
        if( m_delegate.isInfoEnabled() )
        {
            m_delegate.inform( msg, null );
        }
    }

    /**
     * This method is similar to {@link #info(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    public void info( Marker marker, String format, Object arg )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.inform( message, null );
        }
    }

    /**
     * This method is similar to {@link #info(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void info( Marker marker, String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.inform( message, null );
        }
    }

    /**
     * This method is similar to {@link #info(String, Object[])}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void info( Marker marker, String format, Object[] argArray )
    {
        if( m_delegate.isInfoEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.inform( message, null );
        }
    }

    /**
     * This method is similar to {@link #info(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    public void info( Marker marker, String msg, Throwable t )
    {
        if( m_delegate.isInfoEnabled() )
        {
            m_delegate.inform( msg, t );
        }
    }

    /**
     * Is the logger instance enabled for the WARN level?
     *
     * @return True if this Logger is enabled for the WARN level,
     *         false otherwise.
     */
    public boolean isWarnEnabled()
    {
        return m_delegate.isWarnEnabled();
    }

    /**
     * Log a message at the WARN level.
     *
     * @param msg the message string to be logged
     */
    public void warn( String msg )
    {
        if( m_delegate.isWarnEnabled() )
        {
            m_delegate.warn( msg, null );
        }
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and argument.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    public void warn( String format, Object arg )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.warn( message, null );
        }
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void warn( String format, Object[] argArray )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.warn( message, null );
        }
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void warn( String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.warn( message, null );
        }
    }

    /**
     * Log an exception (throwable) at the WARN level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    public void warn( String msg, Throwable t )
    {
        if( m_delegate.isWarnEnabled() )
        {
            m_delegate.warn( msg, t );
        }
    }

    /**
     * Similar to {@link #isWarnEnabled()} method except that the marker
     * data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     */
    public boolean isWarnEnabled( Marker marker )
    {
        return m_delegate.isWarnEnabled();
    }

    /**
     * Log a message with the specific Marker at the WARN level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    public void warn( Marker marker, String msg )
    {
        if( m_delegate.isWarnEnabled() )
        {
            m_delegate.warn( msg, null );
        }
    }

    /**
     * This method is similar to {@link #warn(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    public void warn( Marker marker, String format, Object arg )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.warn( message, null );
        }
    }

    /**
     * This method is similar to {@link #warn(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void warn( Marker marker, String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.warn( message, null );
        }
    }

    /**
     * This method is similar to {@link #warn(String, Object[])}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void warn( Marker marker, String format, Object[] argArray )
    {
        if( m_delegate.isWarnEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.warn( message, null );
        }
    }

    /**
     * This method is similar to {@link #warn(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    public void warn( Marker marker, String msg, Throwable t )
    {
        if( m_delegate.isWarnEnabled() )
        {
            m_delegate.warn( msg, t );
        }
    }

    /**
     * Is the logger instance enabled for the ERROR level?
     *
     * @return True if this Logger is enabled for the ERROR level,
     *         false otherwise.
     */
    public boolean isErrorEnabled()
    {
        return m_delegate.isErrorEnabled();
    }

    /**
     * Log a message at the ERROR level.
     *
     * @param msg the message string to be logged
     */
    public void error( String msg )
    {
        if( m_delegate.isErrorEnabled() )
        {
            m_delegate.error( msg, null );
        }
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and argument.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    public void error( String format, Object arg )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.error( message, null );
        }
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void error( String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.error( message, null );
        }
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     *
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void error( String format, Object[] argArray )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.error( message, null );
        }
    }

    /**
     * Log an exception (throwable) at the ERROR level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    public void error( String msg, Throwable t )
    {
        if( m_delegate.isErrorEnabled() )
        {
            m_delegate.error( msg, t );
        }
    }

    /**
     * Similar to {@link #isErrorEnabled()} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     */
    public boolean isErrorEnabled( Marker marker )
    {
        return m_delegate.isErrorEnabled();
    }

    /**
     * Log a message with the specific Marker at the ERROR level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    public void error( Marker marker, String msg )
    {
        if( m_delegate.isErrorEnabled() )
        {
            m_delegate.error( msg, null );
        }
    }

    /**
     * This method is similar to {@link #error(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    public void error( Marker marker, String format, Object arg )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, arg );
            m_delegate.error( message, null );
        }
    }

    /**
     * This method is similar to {@link #error(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void error( Marker marker, String format, Object arg1, Object arg2 )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, arg1, arg2 );
            m_delegate.error( message, null );
        }
    }

    /**
     * This method is similar to {@link #error(String, Object[])}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     */
    public void error( Marker marker, String format, Object[] argArray )
    {
        if( m_delegate.isErrorEnabled() )
        {
            String message = MessageFormatter.format( format, argArray );
            m_delegate.error( message, null );
        }
    }

    /**
     * This method is similar to {@link #error(String, Throwable)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    public void error( Marker marker, String msg, Throwable t )
    {
        if( m_delegate.isErrorEnabled() )
        {
            m_delegate.error( msg, t );
        }
    }

    void setPaxLoggingManager( PaxLoggingManager loggingManager, String name )
    {
        m_delegate = loggingManager.getLogger( name );
    }
}
