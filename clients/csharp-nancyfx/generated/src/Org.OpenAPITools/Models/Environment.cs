using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// An Environment that 
    /// </summary>
    public sealed class Environment:  IEquatable<Environment>
    { 
        /// <summary>
        /// id
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        public string ProgramId { get; private set; }

        /// <summary>
        /// Name of the environment
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Description of the environment
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Type of the environment
        /// </summary>
        public TypeEnum? Type { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public EnvironmentLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Environment.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Environment()
        {
        }

        private Environment(string Id, string ProgramId, string Name, string Description, TypeEnum? Type, EnvironmentLinks Links)
        {
            
            this.Id = Id;
            
            this.ProgramId = ProgramId;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Type = Type;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of Environment.
        /// </summary>
        /// <returns>EnvironmentBuilder</returns>
        public static EnvironmentBuilder Builder()
        {
            return new EnvironmentBuilder();
        }

        /// <summary>
        /// Returns EnvironmentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentBuilder</returns>
        public EnvironmentBuilder With()
        {
            return Builder()
                .Id(Id)
                .ProgramId(ProgramId)
                .Name(Name)
                .Description(Description)
                .Type(Type)
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

        public bool Equals(Environment other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Environment.
        /// </summary>
        /// <param name="left">Compared (Environment</param>
        /// <param name="right">Compared (Environment</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Environment left, Environment right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Environment.
        /// </summary>
        /// <param name="left">Compared (Environment</param>
        /// <param name="right">Compared (Environment</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Environment left, Environment right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Environment.
        /// </summary>
        public sealed class EnvironmentBuilder
        {
            private string _Id;
            private string _ProgramId;
            private string _Name;
            private string _Description;
            private TypeEnum? _Type;
            private EnvironmentLinks _Links;

            internal EnvironmentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Environment.Id property.
            /// </summary>
            /// <param name="value">id</param>
            public EnvironmentBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Environment.ProgramId property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space.</param>
            public EnvironmentBuilder ProgramId(string value)
            {
                _ProgramId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Environment.Name property.
            /// </summary>
            /// <param name="value">Name of the environment</param>
            public EnvironmentBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Environment.Description property.
            /// </summary>
            /// <param name="value">Description of the environment</param>
            public EnvironmentBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Environment.Type property.
            /// </summary>
            /// <param name="value">Type of the environment</param>
            public EnvironmentBuilder Type(TypeEnum? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for Environment.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public EnvironmentBuilder Links(EnvironmentLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Environment.
            /// </summary>
            /// <returns>Environment</returns>
            public Environment Build()
            {
                Validate();
                return new Environment(
                    Id: _Id,
                    ProgramId: _ProgramId,
                    Name: _Name,
                    Description: _Description,
                    Type: _Type,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum TypeEnum { Dev, Stage, Prod };
    }
}