using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Log from Environment
    /// </summary>
    public sealed class EnvironmentLog:  IEquatable<EnvironmentLog>
    { 
        /// <summary>
        /// Name of the service
        /// </summary>
        public string Service { get; private set; }

        /// <summary>
        /// Name of the Log
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// date of the Log
        /// </summary>
        public string Date { get; private set; }

        /// <summary>
        /// ProgramId
        /// </summary>
        public long? ProgramId { get; private set; }

        /// <summary>
        /// EnvironmentId
        /// </summary>
        public long? EnvironmentId { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public EnvironmentLogLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentLog.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLog()
        {
        }

        private EnvironmentLog(string Service, string Name, string Date, long? ProgramId, long? EnvironmentId, EnvironmentLogLinks Links)
        {
            
            this.Service = Service;
            
            this.Name = Name;
            
            this.Date = Date;
            
            this.ProgramId = ProgramId;
            
            this.EnvironmentId = EnvironmentId;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLog.
        /// </summary>
        /// <returns>EnvironmentLogBuilder</returns>
        public static EnvironmentLogBuilder Builder()
        {
            return new EnvironmentLogBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLogBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLogBuilder</returns>
        public EnvironmentLogBuilder With()
        {
            return Builder()
                .Service(Service)
                .Name(Name)
                .Date(Date)
                .ProgramId(ProgramId)
                .EnvironmentId(EnvironmentId)
                .Links(Links);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentLog other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLog.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLog</param>
        /// <param name="right">Compared (EnvironmentLog</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLog left, EnvironmentLog right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLog.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLog</param>
        /// <param name="right">Compared (EnvironmentLog</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLog left, EnvironmentLog right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLog.
        /// </summary>
        public sealed class EnvironmentLogBuilder
        {
            private string _Service;
            private string _Name;
            private string _Date;
            private long? _ProgramId;
            private long? _EnvironmentId;
            private EnvironmentLogLinks _Links;

            internal EnvironmentLogBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLog.Service property.
            /// </summary>
            /// <param name="value">Name of the service</param>
            public EnvironmentLogBuilder Service(string value)
            {
                _Service = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLog.Name property.
            /// </summary>
            /// <param name="value">Name of the Log</param>
            public EnvironmentLogBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLog.Date property.
            /// </summary>
            /// <param name="value">date of the Log</param>
            public EnvironmentLogBuilder Date(string value)
            {
                _Date = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLog.ProgramId property.
            /// </summary>
            /// <param name="value">ProgramId</param>
            public EnvironmentLogBuilder ProgramId(long? value)
            {
                _ProgramId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLog.EnvironmentId property.
            /// </summary>
            /// <param name="value">EnvironmentId</param>
            public EnvironmentLogBuilder EnvironmentId(long? value)
            {
                _EnvironmentId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLog.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public EnvironmentLogBuilder Links(EnvironmentLogLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLog.
            /// </summary>
            /// <returns>EnvironmentLog</returns>
            public EnvironmentLog Build()
            {
                Validate();
                return new EnvironmentLog(
                    Service: _Service,
                    Name: _Name,
                    Date: _Date,
                    ProgramId: _ProgramId,
                    EnvironmentId: _EnvironmentId,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}