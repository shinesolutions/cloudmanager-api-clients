using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Logs of an Environment
    /// </summary>
    public sealed class EnvironmentLogs:  IEquatable<EnvironmentLogs>
    { 
        /// <summary>
        /// Name of the service
        /// </summary>
        public List<string> Service { get; private set; }

        /// <summary>
        /// Name of the Log
        /// </summary>
        public List<string> Name { get; private set; }

        /// <summary>
        /// Number of days
        /// </summary>
        public int? Days { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public EnvironmentLogsLinks Links { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public EnvironmentLogsEmbedded Embedded { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentLogs.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLogs()
        {
        }

        private EnvironmentLogs(List<string> Service, List<string> Name, int? Days, EnvironmentLogsLinks Links, EnvironmentLogsEmbedded Embedded)
        {
            
            this.Service = Service;
            
            this.Name = Name;
            
            this.Days = Days;
            
            this.Links = Links;
            
            this.Embedded = Embedded;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLogs.
        /// </summary>
        /// <returns>EnvironmentLogsBuilder</returns>
        public static EnvironmentLogsBuilder Builder()
        {
            return new EnvironmentLogsBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLogsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLogsBuilder</returns>
        public EnvironmentLogsBuilder With()
        {
            return Builder()
                .Service(Service)
                .Name(Name)
                .Days(Days)
                .Links(Links)
                .Embedded(Embedded);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentLogs other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLogs.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogs</param>
        /// <param name="right">Compared (EnvironmentLogs</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLogs left, EnvironmentLogs right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLogs.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogs</param>
        /// <param name="right">Compared (EnvironmentLogs</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLogs left, EnvironmentLogs right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLogs.
        /// </summary>
        public sealed class EnvironmentLogsBuilder
        {
            private List<string> _Service;
            private List<string> _Name;
            private int? _Days;
            private EnvironmentLogsLinks _Links;
            private EnvironmentLogsEmbedded _Embedded;

            internal EnvironmentLogsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLogs.Service property.
            /// </summary>
            /// <param name="value">Name of the service</param>
            public EnvironmentLogsBuilder Service(List<string> value)
            {
                _Service = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogs.Name property.
            /// </summary>
            /// <param name="value">Name of the Log</param>
            public EnvironmentLogsBuilder Name(List<string> value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogs.Days property.
            /// </summary>
            /// <param name="value">Number of days</param>
            public EnvironmentLogsBuilder Days(int? value)
            {
                _Days = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogs.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public EnvironmentLogsBuilder Links(EnvironmentLogsLinks value)
            {
                _Links = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogs.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public EnvironmentLogsBuilder Embedded(EnvironmentLogsEmbedded value)
            {
                _Embedded = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLogs.
            /// </summary>
            /// <returns>EnvironmentLogs</returns>
            public EnvironmentLogs Build()
            {
                Validate();
                return new EnvironmentLogs(
                    Service: _Service,
                    Name: _Name,
                    Days: _Days,
                    Links: _Links,
                    Embedded: _Embedded
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}