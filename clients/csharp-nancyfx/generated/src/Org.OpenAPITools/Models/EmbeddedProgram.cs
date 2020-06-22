using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes an __Embedded Program__
    /// </summary>
    public sealed class EmbeddedProgram:  IEquatable<EmbeddedProgram>
    { 
        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Name of the program
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Whether this Program has been enabled for Cloud Manager usage
        /// </summary>
        public bool? Enabled { get; private set; }

        /// <summary>
        /// Tenant Id
        /// </summary>
        public string TenantId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EmbeddedProgram.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmbeddedProgram()
        {
        }

        private EmbeddedProgram(string Id, string Name, bool? Enabled, string TenantId)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Enabled = Enabled;
            
            this.TenantId = TenantId;
            
        }

        /// <summary>
        /// Returns builder of EmbeddedProgram.
        /// </summary>
        /// <returns>EmbeddedProgramBuilder</returns>
        public static EmbeddedProgramBuilder Builder()
        {
            return new EmbeddedProgramBuilder();
        }

        /// <summary>
        /// Returns EmbeddedProgramBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmbeddedProgramBuilder</returns>
        public EmbeddedProgramBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Enabled(Enabled)
                .TenantId(TenantId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EmbeddedProgram other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmbeddedProgram.
        /// </summary>
        /// <param name="left">Compared (EmbeddedProgram</param>
        /// <param name="right">Compared (EmbeddedProgram</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmbeddedProgram left, EmbeddedProgram right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmbeddedProgram.
        /// </summary>
        /// <param name="left">Compared (EmbeddedProgram</param>
        /// <param name="right">Compared (EmbeddedProgram</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmbeddedProgram left, EmbeddedProgram right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmbeddedProgram.
        /// </summary>
        public sealed class EmbeddedProgramBuilder
        {
            private string _Id;
            private string _Name;
            private bool? _Enabled;
            private string _TenantId;

            internal EmbeddedProgramBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Enabled = false;
            }

            /// <summary>
            /// Sets value for EmbeddedProgram.Id property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space.</param>
            public EmbeddedProgramBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmbeddedProgram.Name property.
            /// </summary>
            /// <param name="value">Name of the program</param>
            public EmbeddedProgramBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmbeddedProgram.Enabled property.
            /// </summary>
            /// <param name="value">Whether this Program has been enabled for Cloud Manager usage</param>
            public EmbeddedProgramBuilder Enabled(bool? value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmbeddedProgram.TenantId property.
            /// </summary>
            /// <param name="value">Tenant Id</param>
            public EmbeddedProgramBuilder TenantId(string value)
            {
                _TenantId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmbeddedProgram.
            /// </summary>
            /// <returns>EmbeddedProgram</returns>
            public EmbeddedProgram Build()
            {
                Validate();
                return new EmbeddedProgram(
                    Id: _Id,
                    Name: _Name,
                    Enabled: _Enabled,
                    TenantId: _TenantId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}