using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes a __Program__
    /// </summary>
    public sealed class Program:  IEquatable<Program>
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
        /// Organisation Id
        /// </summary>
        public string ImsOrgId { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Program.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Program()
        {
        }

        private Program(string Id, string Name, bool? Enabled, string TenantId, string ImsOrgId, ProgramLinks Links)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Enabled = Enabled;
            
            this.TenantId = TenantId;
            
            this.ImsOrgId = ImsOrgId;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of Program.
        /// </summary>
        /// <returns>ProgramBuilder</returns>
        public static ProgramBuilder Builder()
        {
            return new ProgramBuilder();
        }

        /// <summary>
        /// Returns ProgramBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProgramBuilder</returns>
        public ProgramBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .Enabled(Enabled)
                .TenantId(TenantId)
                .ImsOrgId(ImsOrgId)
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

        public bool Equals(Program other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Program.
        /// </summary>
        /// <param name="left">Compared (Program</param>
        /// <param name="right">Compared (Program</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Program left, Program right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Program.
        /// </summary>
        /// <param name="left">Compared (Program</param>
        /// <param name="right">Compared (Program</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Program left, Program right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Program.
        /// </summary>
        public sealed class ProgramBuilder
        {
            private string _Id;
            private string _Name;
            private bool? _Enabled;
            private string _TenantId;
            private string _ImsOrgId;
            private ProgramLinks _Links;

            internal ProgramBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Enabled = false;
            }

            /// <summary>
            /// Sets value for Program.Id property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space.</param>
            public ProgramBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Program.Name property.
            /// </summary>
            /// <param name="value">Name of the program</param>
            public ProgramBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Program.Enabled property.
            /// </summary>
            /// <param name="value">Whether this Program has been enabled for Cloud Manager usage</param>
            public ProgramBuilder Enabled(bool? value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Program.TenantId property.
            /// </summary>
            /// <param name="value">Tenant Id</param>
            public ProgramBuilder TenantId(string value)
            {
                _TenantId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Program.ImsOrgId property.
            /// </summary>
            /// <param name="value">Organisation Id</param>
            public ProgramBuilder ImsOrgId(string value)
            {
                _ImsOrgId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Program.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public ProgramBuilder Links(ProgramLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Program.
            /// </summary>
            /// <returns>Program</returns>
            public Program Build()
            {
                Validate();
                return new Program(
                    Id: _Id,
                    Name: _Name,
                    Enabled: _Enabled,
                    TenantId: _TenantId,
                    ImsOrgId: _ImsOrgId,
                    Links: _Links
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for Program and cannot be null");
                } 
            }
        }

        
    }
}